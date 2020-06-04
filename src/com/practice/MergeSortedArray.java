package com.practice;

import java.util.Arrays;

// 88. Merge Sorted Array
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int t = 0;
        int[] temp = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[t] = nums1[i];
                i++;
                t++;
            } else {
                temp[t] = nums2[j];
                j++;
                t++;
            }
        }

        while (i < m) {
            temp[t] = nums1[i];
            i++;
            t++;
        }

        while (j < n) {
            temp[t] = nums2[j];
            j++;
            t++;
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = temp[k];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[] {2, 5, 6};
        int n = 3;

        MergeSortedArray.merge(nums1, m, nums2, n);
    }
}
