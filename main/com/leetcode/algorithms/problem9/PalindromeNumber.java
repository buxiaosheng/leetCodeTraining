package com.leetcode.algorithms.problem9;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int digit = 10;
        int newX = 0;
        while (digit <= temp) {
            int number = temp % digit;
            newX = newX * digit + number;
            temp = temp / 10;
        }
        newX = newX * 10 + temp;
        return newX == x;
    }

    public static void main(String[] param) {
        System.out.print(new PalindromeNumber().isPalindrome(123454321));
    }
}
