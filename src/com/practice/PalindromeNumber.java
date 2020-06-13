package com.practice;

// 9. Palindrome Number
// Example 1:
//
//Input: 121
//Output: true
public class PalindromeNumber {
    public static boolean isPalidrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int result = 0;
        int value = x;
        while (value != 0) {
            int tail = value % 10;
            int newResult = result * 10 + tail;
            if (result != (newResult - tail) / 10) {
                return false;
            }
            result = newResult;
            value /= 10;
        }
        return x == result;
    }

    public static void main(String[] args) {
        System.out.println(PalindromeNumber.isPalidrome(121));
    }
}
