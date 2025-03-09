package incubation.javafeatures.java17;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class FinancialTransactions {
    public static void main(String[] args) {
        // Sample Transactions List
        List<Transaction> transactions = List.of(
                new Transaction("A123", 5000, "Deposit", LocalDateTime.now().minusDays(1)),
                new Transaction("B456", 12000, "Deposit", LocalDateTime.now().minusDays(2)),
                new Transaction("A123", -2000, "Withdraw", LocalDateTime.now().minusDays(3)),
                new Transaction("C789", 15000, "Deposit", LocalDateTime.now().minusDays(4))
        );

        // 1️⃣ Compute balance per account
        Map<String, Double> balances = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::accountId,
                        Collectors.summingDouble(Transaction::amount)
                ));

        System.out.println("Balances per account:");
        balances.forEach((account, balance) ->
                System.out.printf("%s -> %.2f%n", account, balance));

        // 2️⃣ Identify transactions above $10,000 (Fraud detection)
        List<String> fraudTransactions = transactions.stream()
                .filter(t -> t.amount() > 10000)
                .map(Transaction::accountId)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Transactions above $10,000 → " + fraudTransactions);

        // 3️⃣ Find the account with the highest balance
        balances.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .ifPresent(entry ->
                        System.out.println("Account with the highest balance → " + entry.getKey())
                );
    }
}

// Transaction class using Java 14+ Record (Immutable)
record Transaction(String accountId, double amount, String type, LocalDateTime timestamp) {}

