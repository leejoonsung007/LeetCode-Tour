package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 945. Minimum Increment to Make Array Unique
// Input: [3,2,1,2,1,7]
// Output: 6
// Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
// It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
public class MinIncrementForUnique {
    public static int minIncrementForUnique(int[] A) {
        int result = 0;
        Arrays.sort(A);

        for (int i = 1; i < A.length; i++) {
            int pre = A[i-1];
            int curr = A[i];
            if (pre >= curr) {
                result += pre - curr + 1;
                A[i] = pre + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MinIncrementForUnique.minIncrementForUnique(new int[] {1, 2, 2}));
    }
}
