package com.practice;

// 153. Find Minimum in Rotated Sorted Array
// Example 1:
//
// Input: [3,4,5,1,2]
// Output: 1
public class FindMinimuminRotatedSortedArray {

    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(FindMinimuminRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2}));
    }
}
