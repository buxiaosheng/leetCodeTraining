package com.leetcode.algorithms.problem6;

import java.util.ArrayList;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        char[] chars = s.toCharArray();
        char[][] zigZagPatterns = new char[numRows][chars.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < chars.length; k++) {
            if (k == 0) {
                zigZagPatterns[0][0] = chars[k];
            } else if ((k - 1) / (numRows - 1) % 2 == 0) {
                zigZagPatterns[++i][j] = chars[k];
            } else {
                zigZagPatterns[--i][++j] = chars[k];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int k = 0; k < zigZagPatterns.length; k++) {
            for (int h = 0; h < zigZagPatterns[k].length; h++) {
                if (zigZagPatterns[k][h] != '\0') {
                    result.append(zigZagPatterns[k][h]);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] param) {
        System.out.print(new ZigZagConversion().convert("AB", 1));
    }
}
