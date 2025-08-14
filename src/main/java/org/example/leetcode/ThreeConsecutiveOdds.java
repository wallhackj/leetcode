package org.example.leetcode;

public class ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            boolean t = arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1;
            if (i <= n - 2 && t) {
                return true;
            }
        }
        return false;
    }
}
