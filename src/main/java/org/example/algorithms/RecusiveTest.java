package org.example.algorithms;

import java.util.Arrays;

public class RecusiveTest {
    public static void main(String[] args) {
        System.out.println(factorial(20));
        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(sumElements(nums));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        return nums[0] + sumElements(Arrays.copyOfRange(nums, 1, nums.length));
    }
}
