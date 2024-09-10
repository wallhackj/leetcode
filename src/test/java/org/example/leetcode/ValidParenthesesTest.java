package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    @Test
    void isValid() {
        assertThat(ValidParentheses.isValid("()")).isEqualTo(true);
    }

    @Test
    void isValid2() {
        assertThat(ValidParentheses.isValid("()[]{}")).isEqualTo(true);
    }

    @Test
    void isValid3() {
        assertThat(ValidParentheses.isValid("(]")).isEqualTo(false);
    }

    @Test
    void isValid4() {
        assertThat(ValidParentheses.isValid("([])")).isEqualTo(true);
    }
}