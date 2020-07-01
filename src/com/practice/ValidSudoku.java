package com.practice;

// 36. Valid Sudoku
// Input:
//[
//  ["8","3",".",".","7",".",".",".","."],
//  ["6",".",".","1","9","5",".",".","."],
//  [".","9","8",".",".",".",".","6","."],
//  ["8",".",".",".","6",".",".",".","3"],
//  ["4",".",".","8",".","3",".",".","1"],
//  ["7",".",".",".","2",".",".",".","6"],
//  [".","6",".",".",".",".","2","8","."],
//  [".",".",".","4","1","9",".",".","5"],
//  [".",".",".",".","8",".",".","7","9"]
//]
// Output: false
// Explanation: Same as Example 1, except with the 5 in the top left corner being
//    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board[0].length != 9 || board.length != 9) return false;

        // rule one
        for (int row = 0; row < 9; row++) {
            boolean[] taken = new boolean[9];
            for (int idx = 0; idx < 9; idx++) {
                char c = board[row][idx];
                if (c != '.') {
                    int num = c - '1';
                    if (taken[num] == true) return false;
                    else taken[num] = true;
                }
            }
        }

        // rule two
        for (int column = 0; column < 9; column++) {
            boolean[] taken = new boolean[9];
            for(int idx = 0; idx < 9; idx++) {
                char c = board[idx][column];
                if (c != '.') {
                    int num = c - '1';
                    if (taken[num] == true) return false;
                    else taken[num] = true;
                }
            }
        }

        // rule three
        for (int box = 0; box < 9; box++) {
            boolean[] taken = new boolean[9];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    char c = board[row + 3 * (box / 3)][col + 3 * (box % 3)];
                    if (c  != '.') {
                        int num = c - '1';
                        if(taken[num] == true) return false;
                        taken[num]  = true;
                    }
                }
            }
        }
        return true;
    }
}


