package org.example.leetcode;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (Math.abs(i - map.get(nums[i])) <= k)) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
