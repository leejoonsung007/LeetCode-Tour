package com.practice;

// 47. Permutations II
// Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
// Example:
//
// Input: [1,1,2]
// Output:
// [
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
// ]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return res;
        }
        Arrays.sort(nums);
        helper (res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;

    }

    private void helper (List<List<Integer>> res, List<Integer> curList, int[] nums, boolean[] used) {
        if (curList.size() == nums.length) {
            res.add(new ArrayList<>(curList));
        } else {
            int preNum = nums[0] - 1;
            for (int i = 0; i < nums.length; i++) {
                if (used[i] == false && preNum != nums[i]) {
                    curList.add(nums[i]);
                    used[i] = true;
                    preNum = nums[i];
                    int lastIndex = curList.size() - 1;
                    helper(res, curList, nums, used);
                    used[i] = false;
                    curList.remove(lastIndex);
                }
            }
        }
    }
}
