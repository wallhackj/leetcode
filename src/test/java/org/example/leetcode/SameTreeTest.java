package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameTreeTest {

    @Test
    void isSameTree() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        assertThat(SameTree.isSameTree(p, q)).isTrue();
    }

    @Test
    void isSameTree2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));

        assertThat(SameTree.isSameTree(p, q)).isFalse();
    }

    @Test
    void isSameTree3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));

        assertThat(SameTree.isSameTree(p, q)).isFalse();
    }
}