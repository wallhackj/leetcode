package org.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    @ParameterizedTest
    @CsvSource({
            "anagram, nagaram, true",
            "rat, car, false"
    })
    void isAnagram(String s, String t, boolean expected) {
        assertThat(ValidAnagram.isAnagram(s, t)).isEqualTo(expected);
    }
}