package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
    }

    @Test
    void longestCommonPrefix2() {
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[]{"", ""})).isEqualTo("");
    }

    @Test
    void longestCommonPrefix3() {
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
    }
}