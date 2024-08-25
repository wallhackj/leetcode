package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElementTest {

    @Test
    void majorityElement1() {
        assertThat(MajorityElement.majorityElement(new int[]{3, 2, 3})).isEqualTo(3);
    }

    @Test
    void majorityElement2() {
        assertThat(MajorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    void majorityElement3() {
        assertThat(MajorityElement.majorityElement(new int[]{6, 5, 5})).isEqualTo(5);
    }
}