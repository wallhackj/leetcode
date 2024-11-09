package org.example.leetcode;

import org.example.leetcode.sub.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.ConvertSortedArrayToBinarySearchTree.sortedArrayToBST;

class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    void testSortedArrayToBST() {
        int[] arr = new int[]{-10, -3, 0, 5, 9};

        TreeNode leftSubTree2 = new TreeNode(-10, null, new TreeNode(-3));
        TreeNode rightSubTree2 = new TreeNode(5, null, new TreeNode(9));
        TreeNode expectedRoot2 = new TreeNode(0, leftSubTree2, rightSubTree2);

        assertThat(sortedArrayToBST(arr)).isEqualTo(expectedRoot2);
    }

    @Test
    void testSortedArrayToBST2() {
        int[] arr = new int[]{1,3};

        TreeNode expectedRoot1 = new TreeNode(1, null, new TreeNode(3));

        assertThat(sortedArrayToBST(arr)).isEqualTo(expectedRoot1);
    }
}