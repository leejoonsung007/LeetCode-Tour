package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 46. Permutations
// Given a collection of distinct integers, return all possible permutations.
// Example:
//
// Input: [1,2,3]
// Output:
// [
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
// ]
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return res;
        }
        helper(res, new ArrayList<>(), nums, new HashSet<>());
        return res;
    }

    private void helper (List<List<Integer>> res, List<Integer> list, int[] nums, HashSet<Integer> set) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(nums[i])) {
                    set.add(nums[i]);
                    list.add(nums[i]);
                    int lastIndex = list.size() - 1;
                    helper(res, list, nums, set);
                    set.remove(nums[i]);
                    list.remove(lastIndex);
                }
            }
        }
    }
}
