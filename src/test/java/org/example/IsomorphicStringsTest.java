package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class IsomorphicStringsTest {

    @ParameterizedTest
    @CsvSource({
            "egg, add, true",
            "foo, bar, false",
            "paper, title, true"
    })
    void canConstruct(String s, String t, boolean canConstruct) {
        assertThat(IsomorphicStrings.isIsomorphic(s, t)).isEqualTo(canConstruct);
    }
}