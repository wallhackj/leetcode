package org.example.leetcode;

public class CheckDistancesBetweenSameLetters {
    public static boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); ++i) {
            var dist = distance[s.charAt(i) - 'a'];
            if (i + dist + 1 >= s.length() || s.charAt(i + dist + 1) != s.charAt(i)) return false;
            distance[s.charAt(i) - 'a'] = -1;
        }
        return true;
    }
}
