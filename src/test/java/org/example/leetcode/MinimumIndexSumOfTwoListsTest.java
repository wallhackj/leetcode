package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.leetcode.MinimumIndexSumOfTwoLists.findRestaurant;

class MinimumIndexSumOfTwoListsTest {

    @Test
    void findRestaurant1() {
        assertThat(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}))
                .isEqualTo(new String[]{"Shogun"});
    }

    @Test
    void findRestaurant2() {
        assertThat(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"KFC","Shogun","Burger King"}))
                .isEqualTo(new String[]{"Shogun"});
    }

    @Test
    void findRestaurant3() {
        assertThat(findRestaurant(new String[]{"happy","sad","good"},
                new String[]{"sad","happy","good"}))
                .isEqualTo(new String[]{"sad","happy"});
    }
}