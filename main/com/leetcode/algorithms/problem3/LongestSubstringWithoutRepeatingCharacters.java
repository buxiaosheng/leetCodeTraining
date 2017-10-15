package com.leetcode.algorithms.problem3;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        HashMap<Character, Integer> keys = new HashMap<>();
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (keys.containsKey(c)) {
                if (current > max) {
                    max = current;
                }
                if (start <= keys.get(c)) {
                    start = keys.get(c) + 1;
                    current = i - start;
                }
            }
            current++;
            keys.put(c, i);
        }
        return max < current ? current : max;
    }
}