package com.practice;

import java.util.ArrayList;
import java.util.*;

//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            list.add(0,1);

            for (int j = 1; j < list.size() - 1; j++) { // 1， 1， 1 -> 1, 2, 1 (index1 + index2)

                list.set(j, list.get(j) + list.get(j + 1));
            }

            res.add(new ArrayList<>(list));
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle.generate(5);
    }
}
