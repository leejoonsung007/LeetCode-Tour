package com.practice;

import java.util.HashSet;

// 3. Longest Substring Without Repeating Characters
// Example 1:
//
//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
public class LengthOfLongestSubString {
    public static int lengthOfLongestSubString(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            } else {
                set.add(s.charAt(i));
                res = Math.max(res, set.size());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(LengthOfLongestSubString.lengthOfLongestSubString("abcabcdb"));
    }
}
