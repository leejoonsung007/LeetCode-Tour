package com.practice;

import java.util.PriorityQueue;

// 215. Kth Largest Element in an Array
// Example 1:
//
//Input: [3,2,1,5,6,4] and k = 2
//Output: 5
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {

        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums) {
            pq.offer(val);
        }

        while (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
