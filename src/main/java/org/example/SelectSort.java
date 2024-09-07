package org.example;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }

            if (max != i) {
                int temp = nums[i];
                nums[i] ^= nums[max];
                nums[max] = temp;
            }
        }
    }
}
