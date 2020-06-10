package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            int target = -nums[i];

            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while (nums[start] == nums[start - 1]) start++;
                    while (nums[end] == nums[end + 1]) end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else if (nums[start] + nums[end] > target) {
                    end--;
                }
            }
        }
     return res;
    }

    public static void main(String[] args) {
        System.out.println(ThreeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
    }
}
