package com.practice;

import java.util.ArrayList;
import java.util.List;

// 54.Spiral Matrix
//  Input:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//Output: [1,2,3,6,9,8,7,4,5]
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;

        while (res.size() < size) {
            for (int i = left; i <= right && res.size() < size; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && res.size() < size; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left && res.size() < size; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && res.size() < size; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(SpiralMatrix.spiralOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
