package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 316. Remove Duplicate Letters
// Given a string which contains only lowercase letters,
// remove duplicate letters so that every letter appears once and only once.
// You must make sure your result is the smallest in lexicographical order among all possible results.
// Example 2:
//
//Input: "cbacdcbc"
//Output: "acdb"
public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];
        boolean[] used = new boolean[26];

        char[] arr = s.toCharArray();
        for (char c: arr) {
            count[c - 'a']++;
        }

        for (char c: arr) {
            count[c - 'a']--;
            if (used[c - 'a']) continue;
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                used[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            used[c - 'a'] = true;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
    }
}
