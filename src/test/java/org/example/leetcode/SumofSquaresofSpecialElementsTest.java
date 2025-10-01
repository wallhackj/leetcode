package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.SumofSquaresofSpecialElements.sumOfSquares;

class SumofSquaresofSpecialElementsTest {

    @Test
    void sumOfSquares1() {
        assertThat(sumOfSquares(new int[]{1,2,3,4})).isEqualTo(21);
    }

    @Test
    void sumOfSquares2() {
        assertThat(sumOfSquares(new int[]{2,7,1,19,18,3})).isEqualTo(63);
    }
}