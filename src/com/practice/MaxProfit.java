package com.practice;

// 121. Best Time to Buy and Sell Stock
// Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//             Not 7-1 = 6, as selling price needs to be larger than buying price.
public class MaxProfit {
    //Method1
//    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                maxProfit = Math.max(maxProfit, profit);
//            }
//        }
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MIN_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(MaxProfit.maxProfit(prices));
    }
}
