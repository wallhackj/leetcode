package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void twoSum() {
        assertThat(TwoSum.twoSum(new int[]{2,7,11,15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void twoSum2() {
        assertThat(TwoSum.twoSum(new int[]{3,2,4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void twoSum3() {
        assertThat(TwoSum.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }
}