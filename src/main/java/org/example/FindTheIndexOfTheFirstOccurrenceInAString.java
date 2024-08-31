package org.example;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
           if (haystack.startsWith(needle, i)) {
               return i;
           }
        }
        return -1;
    }
}
