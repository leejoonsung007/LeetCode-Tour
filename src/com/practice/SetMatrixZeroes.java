package com.practice;

// 73. Set Matrix Zeroes
// Example 1:
//
//Input:
//[
//  [1,1,1],
//  [1,0,1],
//  [1,1,1]
//]
//Output:
//[
//  [1,0,1],
//  [0,0,0],
//  [1,0,1]
//]

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int colSize = matrix.length;
        int rowSize = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;

        for (int i = 0; i < colSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        colZero = true;
                    }
                    if (j == 0) {
                        rowZero = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < colSize; i++) {
                if (matrix[0][i] == 0) {
                    for (int j = 1; j < rowSize; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < rowSize; j++) {
                if (matrix[j][0] == 0) {
                for (int i = 1; i < colSize; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for(int i = 0; i < rowSize; i++) {
                matrix[0][i] = 0;
            }
        }

        if (colZero) {
            for (int j = 0; j < colSize; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}
