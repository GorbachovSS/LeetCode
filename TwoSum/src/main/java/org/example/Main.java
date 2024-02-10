package org.example;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static int[] ints = {2, 7, 11, 15};
    public static int target = 9;

    public static void main(String[] args) {
        twoSum(ints, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}