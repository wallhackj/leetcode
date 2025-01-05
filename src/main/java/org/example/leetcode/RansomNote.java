package org.example.leetcode;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer, Character> map = new HashMap<>();
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        for (char c : r) {
            for (int j = 0; j < m.length; j++) {
                if (c == m[j] && !map.containsKey(j)) {
                    map.put(j, m[j]);
                    break;
                }
            }
        }
        return map.size() == ransomNote.length();
    }
}
