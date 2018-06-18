package com.leetcode.algorithms.problem10;


/**
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        boolean[] flags = new boolean[s.length()];
        int j = 0;
        int i = 0;
        while (i < s.length() && j < p.length()) {
            char c = s.charAt(i);

            char pattern = p.charAt(j);
            if (pattern == '*') {
                pattern = p.charAt(j - i);
            } else if (pattern == '.') {
                flags[i] = true;
                i++;
                j++;
                continue;
            }
            flags[i] = c == pattern;

            i++;
            j++;
        }

        for (boolean flag : flags) {
            if (!flag) return false;
        }
        return true;
    }

    public static void main(String[] param) {
        System.out.print(new RegularExpressionMatching().isMatch("aaa", "a."));
    }
}
