package com.leetcode.algorithms.problem1;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashTableForInput = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hashTableForInput.containsKey(target - num)) {
                return new int[]{hashTableForInput.get(target - num), i};
            }
            hashTableForInput.put(num, i);
        }
        return null;
    }
}
