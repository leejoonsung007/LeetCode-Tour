package com.practice;

// Implement int sqrt(int x).
// Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
// Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
public class Sqrt {
    public int mySqrt(int x) {
        long r = x;
        while(r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }

    public static void main() {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(4));
    }
}
