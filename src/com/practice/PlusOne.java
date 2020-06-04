package com.practice;

import java.util.Arrays;

// 66. Plus One
// Given a *non-empty* array of digits representing a non-negative integer, plus one to the integer.
// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                result[i] = digits[i];
            }
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[] {9, 9, 9};
        System.out.print(Arrays.toString(PlusOne.plusOne(digits)));
    }
}
