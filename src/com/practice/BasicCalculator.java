package com.practice;

import java.util.Stack;

// 224. Basic Calculator
//  Example 3:
//
// Input: "(1+(4+5+2)-3)+(6+8)"
// Output: 23
public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int subSum = 0;
        int sign = 1;
        int num = 0;

        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                subSum += num * sign;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                subSum += num * sign;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(subSum);
                subSum = 0;
                num = 0;
                stack.push(sign);
                sign = 1;
            } else if (c == ')') {
                subSum += num * sign;
                num = 0;
                sign = 1;
                subSum *= stack.pop();
                subSum += stack.pop();
            }
            i++;
        }
        if (num != 0) {
            subSum += num * sign;
        }
        return subSum;
    }
}
