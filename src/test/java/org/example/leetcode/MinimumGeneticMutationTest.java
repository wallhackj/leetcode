package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.MinimumGeneticMutation.minMutation;

class MinimumGeneticMutationTest {

    @Test
    void minMutation1() {
        assertThat(minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"})).isEqualTo(1);
    }

    @Test
    void minMutation2() {
        assertThat(minMutation("AACCGGTT", "AAACGGTA",
                new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"})).isEqualTo(2);
    }

    @Test
    void minMutation3() {
        assertThat(minMutation("AACCTTGG", "AATTCCGG",
                new String[]{"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"})).isEqualTo(-1);
    }
}