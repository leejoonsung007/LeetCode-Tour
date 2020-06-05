package com.practice;

// 122. Best Time to Buy and Sell Stock II
// Example 1:
//
//Input: [7,1,5,3,6,4]
//Output: 7
//Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
public class MaxProfit2 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(MaxProfit2.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
