package com.practice;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    private void reverse(char[]s, int start, int end) {
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        char[] c = new char[] {'h','e','l','l','o'};
        reverseString.reverseString(c);
        System.out.println(Arrays.toString(c));
    }
}
