package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HappyNumberTest {

    @Test
    void duplicate() {
        assertThat(ContainsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)).isEqualTo(true);
    }

    @Test
    void duplicate2() {
        assertThat(ContainsDuplicateII.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)).isEqualTo(true);
    }

    @Test
    void duplicate3() {
        assertThat(ContainsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)).isEqualTo(false);
    }
}