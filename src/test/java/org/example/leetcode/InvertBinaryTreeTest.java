package org.example.leetcode;

import org.example.leetcode.sub.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InvertBinaryTreeTest {

    @Test
    void invertTree() {
        var root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        var root1 = new TreeNode(4, new TreeNode(7), new TreeNode(2));
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(6);
        root1.right.left = new TreeNode(3);
        root1.right.right = new TreeNode(1);

        assertThat(InvertBinaryTree.invertTree(root)).isEqualTo(root1);
    }

    @Test
    void invertTree2() {
        var root = new TreeNode();

        var root1 = new TreeNode();

        assertThat(InvertBinaryTree.invertTree(root)).isEqualTo(root1);
    }
}