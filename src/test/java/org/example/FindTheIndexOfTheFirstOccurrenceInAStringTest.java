package org.example;

import org.example.leetcode.FindTheIndexOfTheFirstOccurrenceInAString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void strStr() {
        assertThat(FindTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad", "sad")).isEqualTo(0);
    }

    @Test
    void strStr2() {
        assertThat(FindTheIndexOfTheFirstOccurrenceInAString.strStr("leetcode", "leeto")).isEqualTo(-1);
    }
}