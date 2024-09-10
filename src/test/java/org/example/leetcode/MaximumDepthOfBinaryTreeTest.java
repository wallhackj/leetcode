package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepth() {
        var root1 = new MaximumDepthOfBinaryTree.TreeNode(3);
        root1.left = new MaximumDepthOfBinaryTree.TreeNode(9);
        root1.right = new MaximumDepthOfBinaryTree.TreeNode(20);
        root1.right.left = new MaximumDepthOfBinaryTree.TreeNode(15);
        root1.right.right = new MaximumDepthOfBinaryTree.TreeNode(7);

        assertThat(MaximumDepthOfBinaryTree.maxDepth(root1)).isEqualTo(3);
    }

    @Test
    void maxDepth2() {
        var root1 = new MaximumDepthOfBinaryTree.TreeNode(1, null,
                new MaximumDepthOfBinaryTree.TreeNode(2));

        assertThat(MaximumDepthOfBinaryTree.maxDepth(root1)).isEqualTo(2);
    }
}