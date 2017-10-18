package com.leetcode.algorithms.problem5;

public class LongestPalindromicSubstring {
    private int start = 0;
    private int end = 0;

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length <= 1) return s;
        for (int i = 0; i < length - 1; i++) {
            findPalindrome(s, i, i);
            findPalindrome(s, i, i + 1);
        }
        return s.substring(start, end);
    }

    public void findPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                if ((end - start) < ((++j) - (i--))) {
                    start = i + 1;
                    end = j;
                }
            } else {
                break;
            }
        }
    }
}
