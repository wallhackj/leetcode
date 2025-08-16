package org.example.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int s = needle.charAt(0);

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == s) {
                if (haystack.startsWith(needle, i)){
                    return i;
                }
            }
        }
        return -1;
    }
}
