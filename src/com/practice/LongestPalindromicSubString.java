package com.practice;

// 5. Longest Palindromic Substring
// Example 1:
//
// Input: "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
public class LongestPalindromicSubString {
    String res = "";
    public  String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return s;
        for(int i = 0; i < s.length(); i++){
            helper(s, i, i); //single character
            helper(s, i, i+1);
        }
        return res;
    }

    private void helper(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        String cur = s.substring(left + 1, right);
        if(cur.length() > res.length()){
            res = cur;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubString().longestPalindrome("aabbaa"));
    }
}
