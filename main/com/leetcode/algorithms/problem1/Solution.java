package com.leetcode.algorithms.problem1;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

                     if(set.containsKey(target-num)){
                         return new int[]{set.get(target-num),i};
                     }
            set.put(num,i);
        }
        return null;
    }
}
