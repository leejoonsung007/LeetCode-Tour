package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);
        res.add(intervals[0]);

        for (int[] interval : intervals) {
            int[] lastArray = res.get(res.size() - 1);
            if (lastArray[1] >= interval[0]) {
                lastArray[1] = Math.max(lastArray[1], interval[1]);
            } else {
                res.add(interval);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(MergeIntervals.merge(new int[][]{{1, 3}, {2, 6}})));
    }
}
