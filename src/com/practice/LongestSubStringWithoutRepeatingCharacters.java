package com.practice;

import java.util.HashSet;
import java.util.Set;

// 3. Longest Substring Without Repeating Characters
// Input: "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
public class LongestSubStringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0, j = 0;
        while(i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(max, set.size());
                i++;
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab");
    }

}
