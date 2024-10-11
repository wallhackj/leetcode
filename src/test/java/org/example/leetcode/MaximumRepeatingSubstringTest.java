package org.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.MaximumRepeatingSubstring.maxRepeating;

class MaximumRepeatingSubstringTest {

    @ParameterizedTest
    @CsvSource({
            "ababc, ab, 2",
            "ababc, ba, 1",
            "ababc, ac, 0",
            "a, a, 1"
    })
    void maxRepeating1(String input, String expected, int times) {
        assertThat(maxRepeating(input, expected)).isEqualTo(times);
    }
}