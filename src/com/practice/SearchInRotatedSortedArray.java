package com.practice;

// 33. Search in Rotated Sorted Array
// Example 1:
//
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        // locate the smallest index
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

        // find the start point
        if  (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        // general binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
