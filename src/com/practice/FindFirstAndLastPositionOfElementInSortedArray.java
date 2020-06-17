package com.practice;

import java.util.*;

// 34. Find First and Last Position of Element in Sorted Array
// Example 1:
//
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:
//
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {

       int[] res = new int[]{-1, -1};
       if (nums.length == 0 || nums == null) return res;
       res[0] = findFirstPositionOfElement(nums, target);
       res[1] = findLastPositionOfElement(nums, target);
       return res;
    }

    private static int findFirstPositionOfElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] == target) return start;
        else if (nums[end] == target) return end;

        return -1;
    }

    private static int findLastPositionOfElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[end] == target) return end;
        else if (nums[start] == target) return start;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}
