package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        assertThat(IsSubsequence.isSubsequence("abc", "ahbgdc")).isEqualTo(true);
    }

    @Test
    void isSubsequence2() {
        assertThat(IsSubsequence.isSubsequence("axc", "ahbgdc")).isEqualTo(false);
    }

    @Test
    void isSubsequence3() {
        assertThat(IsSubsequence.isSubsequence("acb", "ahbgdc")).isEqualTo(false);
    }
}