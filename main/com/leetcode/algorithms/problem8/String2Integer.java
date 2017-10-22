package com.leetcode.algorithms.problem8;

public class String2Integer {
    public int myAtoi(String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        int sign = 1;
        long total = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i == 0 && c == '-') {
                sign = -1;
                continue;
            } else if (i == 0 && c == '+') {
                continue;
            }
            int number = c - '0';
            if (number >= 0 && number <= 9) {
                total = total * 10 + number;
            } else if (c != '-' || c != '+') {
                break;
            }

            if (total > Integer.MAX_VALUE) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
        }
        return (int) total * sign;
    }
}
