package com.practice;

import java.util.Arrays;

// 242. Valid Anagram
// Given two strings s and t ,
// write a function to determine if t is an anagram of s.
// Input: s = "anagram", t = "nagaram"
// Output: true
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        // solution1 - use sort
//        if (s.length() != t.length())
//            return false;
//
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//
//        return Arrays.equals(sArr, tArr);

        // solution2 - use hash table
        if (s.length() != t.length())
            return false;

        int[] counters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counters[s.charAt(i) - 'a']++;
            counters[t.charAt(i) - 'a']--;
        }
        for (int counter: counters) {
            if (counter != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s, t));
    }
}
