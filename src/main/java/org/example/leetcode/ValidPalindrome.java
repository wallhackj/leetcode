package org.example.leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {
            char ss = s.charAt(start), se = s.charAt(end);

            if ('A' <= ss && 'Z' >= ss) ss |= (1<<5);
            if ('A' <= se && 'Z' >= se) se |= (1<<5);

            if (isAlpha(ss)) {
                ++start;
                continue;
            }
            if (isAlpha(se)) {
                --end;
                continue;
            }

            if (ss != se) return false;
            ++start;
            --end;
        }return true;
    }

    private static boolean isAlpha(char c) {
        return ('a' > c || 'z' < c) && ('0' > c || '9' < c);
    }
}
