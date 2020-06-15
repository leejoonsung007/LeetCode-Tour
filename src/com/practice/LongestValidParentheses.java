package com.practice;

import java.util.Stack;

// 32. Longest Valid Parentheses
// Input: ")()())"
// Output: 4
// Explanation: The longest valid parentheses substring is "()()"

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {

        int res = 0;
        int start = -1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    start = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        res = Math.max(res, i - start);
                    } else {
                        res = Math.max(res, i - stack.peek());
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(LongestValidParentheses.longestValidParentheses(")()())"));
    }
}
