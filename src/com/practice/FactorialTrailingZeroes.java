package com.practice;

// 172. Factorial Trailing Zeroes
// Given an integer n, return the number of trailing zeroes in n!.
//
//Example 1:
//Input: 3
//Output: 0
//Explanation: 3! = 6, no trailing zero.
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n != 0) {
            n /= 5;
            res += n;
        }
        return res;
    }
}
