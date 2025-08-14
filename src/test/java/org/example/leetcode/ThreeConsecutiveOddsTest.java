package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.ThreeConsecutiveOdds.threeConsecutiveOdds;

class ThreeConsecutiveOddsTest {

    @Test
    void threeConsecutiveOdds1() {
        assertThat(threeConsecutiveOdds(new int[]{2,6,4,1})).isFalse();
    }

    @Test
    void threeConsecutiveOdds2() {
        assertThat(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12})).isTrue();
    }
}