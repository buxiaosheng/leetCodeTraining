package com.leetcode.algorithms.problem7;

import com.sun.deploy.util.StringUtils;

public class ReverseInteger {
    public int reverse(int x) {
        String s;
        if (x < 0) {
            s = String.valueOf(-x);
            s = s + "-";
        } else {
            s = String.valueOf(x);
        }

        StringBuilder result = new StringBuilder(s);
        try {
            return Integer.parseInt(result.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] param) {
        System.out.print(new ReverseInteger().reverse(0));
    }
}
