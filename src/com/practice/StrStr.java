package com.practice;

// 28. Implement strStr()
// Implement strStr().
// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
// Example 1:
// Input: haystack = "hello", needle = "ll"
// Output: 2
//
// Example 2:
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1

public class StrStr {
    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if (h < n) {
            return -1;
        } else if (n == 0) {
            return 0;
        }

        int range = h - n;

        for (int i = 0; i <= range; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        System.out.println(StrStr.strStr("hello", "ll"));
    }
}
