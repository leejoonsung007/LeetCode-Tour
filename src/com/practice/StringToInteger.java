package com.practice;

public class StringToInteger {
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        int sign = 1;
        int idx = 0;
        char c = str.charAt(0);
        if (c == '+') {
            sign = 1;
            idx++;
        } else if (c == '-') {
            sign = -1;
            idx++;
        }

        long sum = 0;
        for (int i = idx; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) sum * sign;
            }

            sum = sum * 10 + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == - 1 && (-1) *sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

        }
        return (int) sum * sign;
    }

    public static void main(String[] args) {
        System.out.println(StringToInteger.myAtoi("-91283472332"));
    }
}
