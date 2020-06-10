package com.practice;

// 11. Container With Most Water
// Input: [1,8,6,2,5,4,8,3,7]
// Output: 49
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;

        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main (String[] args) {
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
