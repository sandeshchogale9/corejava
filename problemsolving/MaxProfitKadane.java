package incubation.problemsolving;

public class MaxProfitKadane {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Update the minimum price
            maxProfit = Math.max(maxProfit, price - minPrice); // Maximize profit
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Max Profit (Example 1): " + maxProfit(prices1)); // Output: 5
        System.out.println("Max Profit (Example 2): " + maxProfit(prices2)); // Output: 0
    }
}

