package org.example.leetcode;

import java.util.HashMap;

public class RomanToInteger {

    private static final HashMap<Character, Integer> map = new HashMap<>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = map.get(s.charAt(i));

            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > currentVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

}
