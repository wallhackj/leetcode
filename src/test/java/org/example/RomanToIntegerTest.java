package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        assertThat(RomanToInteger.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void romanToInt2() {
        assertThat(RomanToInteger.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void romanToInt3() {
        assertThat(RomanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}