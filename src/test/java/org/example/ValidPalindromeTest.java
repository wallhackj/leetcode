package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        assertThat(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    void isPalindrome2() {
        assertThat(ValidPalindrome.isPalindrome("race a car")).isFalse();
    }

    @Test
    void isPalindrome3() {
        assertThat(ValidPalindrome.isPalindrome(" ")).isTrue();
    }

    @Test
    void isPalindrome4() {
        assertThat(ValidPalindrome.isPalindrome("0P")).isFalse();
    }
}