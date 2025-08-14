package org.example.leetcode;

import java.util.HashMap;

// sa verific daca n-1 == max number in arr
// sa verific ca max number se repeta de 2 ori, iar altele nu
public class CheckIfArrayIsGood {
    static HashMap<Integer, Integer> map;

    public static boolean isGood(int[] nums) {
        int max = Integer.MIN_VALUE, count = 1;
        map = new HashMap<>();

        for (int o : nums) {
            if (!map.containsKey(o)) {
                max = putAndGetMax(o, max);
            }else {
                if (count != 2) {
                    max = putAndGetMax(o, max);
                    count++;
                } else return false;
            }
        }

        return nums.length - 1 == max && map.get(max) == 2;
    }

    private static int putAndGetMax(int o, int max) {
        map.put(o, map.getOrDefault(o, 0) + 1);
        max = Math.max(max, o);
        return max;
    }
}
