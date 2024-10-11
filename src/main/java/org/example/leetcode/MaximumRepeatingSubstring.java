package org.example.leetcode;

public class MaximumRepeatingSubstring {
    public static int maxRepeating(String sequence, String word) {
        var count = 0;
        var repeat = word;

        while (sequence.contains(repeat)) {
            count++;
            repeat += word;
        }

        return count;
    }
}
