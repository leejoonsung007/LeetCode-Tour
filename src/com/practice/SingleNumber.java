package com.practice;

// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
// Input: [2,2,1]
// Output: 1

// KEY: 1 ^ 1 = 0; 0 ^ 1 = 1;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[]{2,2,1};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(test));
    }
}
