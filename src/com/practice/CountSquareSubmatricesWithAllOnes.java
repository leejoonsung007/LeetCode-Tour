package com.practice;

// 1277. Count Square Submatrices with All Ones
// Example 1:
//
//Input: matrix =
//[
//  [0,1,1,1],
//  [1,1,1,1],
//  [0,1,1,1]
//]
//Output: 15
//Explanation:
//There are 10 squares of side 1.
//There are 4 squares of side 2.
//There is  1 square of side 3.
public class CountSquareSubmatricesWithAllOnes {
    public static int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 1){
                result += 1;
            }
            dp[i][0] = matrix[i][0];

        }

        // skip the value in first index, it has been set to dp already
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 1) {
                result += 1;
            }
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i - 1][j - 1]) + 1;
                }
                result += dp[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(CountSquareSubmatricesWithAllOnes.countSquares(new int[][] {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}));
    }
}
