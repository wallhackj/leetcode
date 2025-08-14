package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.example.leetcode.CheckIfArrayIsGood.isGood;

class CheckIfArrayIsGoodTest {

    @Test
    void isGood0() {
        assertThat(isGood(new int[]{1, 1})).isTrue();
    }

    @Test
    void isGood1() {
        assertThat(isGood(new int[]{2, 1, 3})).isFalse();
    }

    @Test
    void isGood2() {
        assertThat(isGood(new int[]{1, 3, 3, 2})).isTrue();
    }

    @Test
    void isGood3() {
        assertThat(isGood(new int[]{3, 4, 4, 1, 2, 1})).isFalse();
    }

    @Test
    void isGood4() {
        assertThat(isGood(new int[]{9, 9})).isFalse();
    }

    @Test
    void isGood5() {
        assertThat(isGood(new int[]{5,1,2,2,5,1})).isFalse();
    }
}