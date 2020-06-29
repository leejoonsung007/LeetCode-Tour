package com.practice;

import java.util.ArrayList;
import java.util.List;

// 17. Letter Combinations of a Phone Number
// Example:
//
// Input: "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
public class LetterCombinationsOfaPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0 || digits == null) {
            return result;
        }

        String[] mapping = {
                "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        letterCombination(result, digits, "", 0, mapping);
        return result;
    }

    private static void letterCombination(List<String> result, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombination(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }

    public static void main (String[] args) {
        LetterCombinationsOfaPhoneNumber.letterCombinations("23");
    }
}
