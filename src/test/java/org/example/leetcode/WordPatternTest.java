package org.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class WordPatternTest {

    @ParameterizedTest
    @CsvSource({"abba, dog cat cat dog, true",
            "abba, dog cat cat fish, false",
            "aaaa, dog cat cat dog, false",
            "abba, dog dog dog dog, false"
    })
    void wordPattern(String pattern, String s, boolean expected) {
        assertThat(WordPattern.wordPattern(pattern, s)).isEqualTo(expected);
    }
}