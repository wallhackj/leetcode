package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    void smallerNumbersThanCurrent1() {
        assertThat(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})).isEqualTo(new int[]{4,0,1,1,3});
    }

    @Test
    void smallerNumbersThanCurrent2() {
        assertThat(smallerNumbersThanCurrent(new int[]{6,5,4,8})).isEqualTo(new int[]{2,1,0,3});
    }

    @Test
    void smallerNumbersThanCurrent3() {
        assertThat(smallerNumbersThanCurrent(new int[]{7,7,7,7})).isEqualTo(new int[]{0,0,0,0});
    }
}