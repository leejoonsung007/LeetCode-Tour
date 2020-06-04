package com.practice;

// 53.Maximum Subarray
//Given an integer array nums, find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
//Example:
//
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // create a dp array to store the optimal structure
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }

}
