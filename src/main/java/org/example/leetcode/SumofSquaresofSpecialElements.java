package org.example.leetcode;

public class SumofSquaresofSpecialElements {
    public static int sumOfSquares(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(n % (i + 1) == 0) {
                int val = nums[i];
                max += val * val;
            }
        }
        return max;
    }
}
