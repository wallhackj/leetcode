package org.example.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.RansomNote.canConstruct;

class RansomNoteTest {

    @ParameterizedTest
    @CsvSource({
            "a, b, false",
            "aa, ab, false",
            "aa, aab, true"
    })
    void canConstruct1(String x, String y, boolean result) {
        assertThat(canConstruct(x, y)).isEqualTo(result);
    }
}