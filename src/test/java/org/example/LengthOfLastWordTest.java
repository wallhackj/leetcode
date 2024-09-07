package org.example;

import org.example.leetcode.LengthOfLastWord;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        assertThat(LengthOfLastWord.lengthOfLastWord("Hello World")).isEqualTo(5);
    }

    @Test
    void lengthOfLastWord2() {
        assertThat(LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
    }

    @Test
    void lengthOfLastWord3() {
        assertThat(LengthOfLastWord.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }
}