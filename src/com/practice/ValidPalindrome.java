package com.practice;

// 125. Valid Palindrome
// Given a string, determine if it is a palindrome,
// considering only alphanumeric characters and ignoring cases.

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // only keep alphanumeric characters and ignoring cases
//        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//        String reverse = new StringBuilder(actual).reverse().toString();
//        return reverse.equals(actual);

        //two pointer

        if(s == null) {
            return false;
        }

        int head = 0;
        int tail = s.length() - 1;
        s = s.toLowerCase();
        while (head < tail) {
            char cHead = s.charAt(head);
            char cTail = s.charAt(tail);

            while (head < tail &&!Character.isLetterOrDigit(cHead))
                head++;
            while (head < tail && !Character.isLetterOrDigit(cTail))
                tail--;

            if (s.charAt(head) == s.charAt(tail)) {
                head++;
                tail--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String input = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome(input));
    }
}
