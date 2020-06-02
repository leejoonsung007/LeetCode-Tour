package com.practice;

// 7. Reverse Integer
// Given a 32-bit signed integer, reverse digits of an integer.
// Example 1:
// Input: 123
// Output: 321

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            // check if integer overflow
            if (result != (newResult - tail) / 10) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }
}
