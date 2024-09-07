package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidMountainArrayTest {

    @Test
    void validMountainArray() {
        assertThat(ValidMountainArray.validMountainArray(new int[]{2,1})).isEqualTo(false);
    }

    @Test
    void validMountainArray2() {
        assertThat(ValidMountainArray.validMountainArray(new int[]{3,5,5})).isEqualTo(false);
    }

    @Test
    void validMountainArray3() {
        assertThat(ValidMountainArray.validMountainArray(new int[]{0,3,2,1})).isEqualTo(true);
    }
}