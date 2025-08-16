package org.example.leetcode;


import java.util.*;

public class MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            String[] tmp = list1;
            list1 = list2;
            list2 = tmp;
        }

        Map<String, Integer> cache = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            cache.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s1 = list2[i];
            Integer j = cache.get(s1);
            if (j == null) continue;

            int k = i + j;
            if (k < min) {
                list = new ArrayList<>();
                list.add(s1);
                min = k;
            } else if (k == min) {
                list.add(s1);
            }
        }

        return list.toArray(new String[0]);
    }
}
