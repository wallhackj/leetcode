package org.example;

import org.example.leetcode.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit1() {
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }

    @Test
    void maxProfit2() {
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }
}