package incubation.javafeatures.java17;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class StockPriceAnalysis {
    public static void main(String[] args) {
        // Sample Stock Price List
        List<StockPrice> prices = List.of(
                new StockPrice("AAPL", 150, LocalDateTime.now().minusMinutes(1)),
                new StockPrice("GOOGL", 2800, LocalDateTime.now().minusMinutes(2)),
                new StockPrice("AAPL", 155, LocalDateTime.now().minusMinutes(3)),
                new StockPrice("TSLA", 750, LocalDateTime.now().minusMinutes(4)),
                new StockPrice("AAPL", 160, LocalDateTime.now().minusMinutes(5))
        );

        String targetStock = "AAPL";
        int lastNMinutes = 5;
        LocalDateTime timeThreshold = LocalDateTime.now().minusMinutes(lastNMinutes);

        // 1️⃣ Find the highest price of AAPL in the last 5 minutes
        prices.stream()
                .filter(s -> s.symbol().equals(targetStock) && s.timestamp().isAfter(timeThreshold))
                .max(Comparator.comparing(StockPrice::price))
                .ifPresent(maxStock ->
                        System.out.println("Highest price for " + targetStock + " in last " + lastNMinutes + " minutes → " + maxStock.price())
                );

        // 2️⃣ Calculate the average price per stock
        Map<String, Double> avgPriceByStock = prices.stream()
                .collect(Collectors.groupingBy(
                        StockPrice::symbol,
                        Collectors.averagingDouble(StockPrice::price)
                ));

        System.out.println("Average price per stock:");
        avgPriceByStock.forEach((symbol, avgPrice) ->
                System.out.printf("%s -> %.2f%n", symbol, avgPrice));

        // 3️⃣ Find stocks that increased by more than 5% in the last 5 minutes
        Map<String, Optional<StockPrice>> latestPrices = prices.stream()
                .filter(s -> s.timestamp().isAfter(timeThreshold))
                .collect(Collectors.groupingBy(
                        StockPrice::symbol,
                        Collectors.maxBy(Comparator.comparing(StockPrice::timestamp))
                ));

        List<String> increasedStocks = latestPrices.entrySet().stream()
                .filter(entry -> {
                    String symbol = entry.getKey();
                    StockPrice latestPrice = entry.getValue().orElse(null);
                    if (latestPrice == null) return false;

                    // Find the stock's price exactly 5 minutes ago
                    Optional<Double> oldPrice = prices.stream()
                            .filter(s -> s.symbol().equals(symbol) && s.timestamp().isBefore(timeThreshold))
                            .map(StockPrice::price)
                            .max(Double::compare);

                    return oldPrice.isPresent() && latestPrice.price() > oldPrice.get() * 1.05;
                })
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Stocks that increased by more than 5% in the last " + lastNMinutes + " minutes → " + increasedStocks);
    }
}

// StockPrice class using Java 14+ Record
record StockPrice(String symbol, double price, LocalDateTime timestamp) {}


