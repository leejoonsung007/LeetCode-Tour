package com.practice;

import java.util.*;

// 347. Top K Frequent Elements
// Example 1:
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
// Example 2:
//Input: nums = [1], k = 1
//Output: [1]
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int key: map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k ; i--) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
            }
        }

        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }

        return resArr;
    }
}
