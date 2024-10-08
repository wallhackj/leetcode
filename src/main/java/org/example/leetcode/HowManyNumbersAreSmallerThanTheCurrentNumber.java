package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        var sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);

        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < sortedArray.length; i++) {
            map.putIfAbsent(sortedArray[i], i);
        }

        var result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
