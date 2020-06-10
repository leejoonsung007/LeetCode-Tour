package com.practice;

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
// Example:
//
//Input: [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6

public class TrappingRainWater {
    public static int strap(int[] height) {
        int currLeft = 0;
        int currRight = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while (currLeft < currRight) {
            if (height[currLeft] < height[currRight]) {
                leftMax = Math.max(leftMax, height[currLeft]);
                res += leftMax - height[currLeft];
                currLeft++;
            } else {
                rightMax = Math.max(rightMax, height[currRight]);
                res += rightMax - height[currRight];
                currRight--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(TrappingRainWater.strap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
