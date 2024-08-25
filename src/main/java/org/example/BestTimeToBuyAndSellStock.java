package org.example;

/**
 * Kadane’s Algorithm
 */

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0, fallen = prices[0];

        for (int i = 1; i < prices.length; i++) {
            fallen = Math.min(fallen, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - fallen);
        }

        return maxProfit;
    }
}
