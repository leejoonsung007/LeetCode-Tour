package com.practice;

// 746. Min Cost Climbing Stairs
// Example 2:
// Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
// Output: 6
// Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int [] mc = new int[cost.length + 1];
        mc[0] = cost[0];
        mc[1] = cost[1];

        for(int i = 2; i <= cost.length; i++){
            // last value can skip
            int costV = (i==cost.length) ? 0 : cost[i];
            mc[i] = Math.min(mc[i-1] + costV, mc[i-2] + costV);
        }
        return mc[cost.length];
    }
}
