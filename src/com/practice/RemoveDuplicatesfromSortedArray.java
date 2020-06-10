package com.practice;

// 26. Remove Duplicates from Sorted Array
// Example 1:
//
//Given nums = [1,1,2],
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//It doesn't matter what you leave beyond the returned length.
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow ++;
            }
        }
        return slow;
    }

    public static void main (String[] args) {
        System.out.println(RemoveDuplicatesfromSortedArray.removeDuplicates(new int[] {1, 1, 2}));
    }
}
