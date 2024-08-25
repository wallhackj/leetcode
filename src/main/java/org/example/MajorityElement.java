package org.example;

/**
 * Moore’s Voting Algorithm
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE, count = 0;

        for (int num:nums) {
            if (count == 0) {
                element = num;
            }

            if (num == element) {
                count++;
            }else count--;
        }

        return element;
    }
}
