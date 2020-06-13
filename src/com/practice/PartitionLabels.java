package com.practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();

        // record the last index of each letters
        int[] map = new int[26];

        for (int i = 0; i < S.length(); i++) {
            map[S.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, map[S.charAt(i) - 'a']);
            if (end == i) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(PartitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
