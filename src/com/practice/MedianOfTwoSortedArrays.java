package com.practice;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len2 < len1) {
            return findMedianSortedArrays(nums2, nums1);
        }
        if (len1 == 0) {
            return ((double)nums2[(nums2.length- 1) / 2] + (double)nums2[nums2.length / 2]) / 2;
        }
        int len = len1 + len2;

        int start1 = 0;
        int end1 = len1;
        int cut1, cut2;
        while (start1 <= end1) {
            cut1 = (start1 + end1) / 2;
            cut2 = (len + 1) / 2 - cut1;
            double l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            double l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            double r1 = cut1 == len1 ? Integer.MAX_VALUE : nums1[cut1];
            double r2 = cut2 == len2 ? Integer.MAX_VALUE: nums2[cut2];

            if (l1 > r2) {
                end1 = cut1 - 1;
            } else if (l2 > r1) {
                start1 = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                } else {
                    return Math.max(l1, l2);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(MedianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{}));
    }
}
