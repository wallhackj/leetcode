package org.example.leetcode;

import org.example.leetcode.sub.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSD(nums, 0,nums.length - 1);
    }

    static TreeNode sortedArrayToBSD(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;

        var left = sortedArrayToBSD(arr, start, mid - 1);
        var right = sortedArrayToBSD(arr, mid + 1, end);
        return new TreeNode(arr[mid], left, right);
    }
}
