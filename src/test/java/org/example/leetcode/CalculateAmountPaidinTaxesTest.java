package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.example.leetcode.CalculateAmountPaidinTaxes.calculateTax;
import static org.junit.jupiter.api.Assertions.*;

class CalculateAmountPaidinTaxesTest {

    @Test
    void calculateTax1() {
        assertEquals(2.65000d, calculateTax(new int[][]{{3,50},{7,10},{12,25}}, 10));
    }
    @Test
    void calculateTax2() {
        assertEquals(0.25000d, calculateTax(new int[][]{{1,0},{4,25},{5,50}}, 2));
    }
    @Test
    void calculateTax3() {
        assertEquals(0.0d, calculateTax(new int[][]{{2,50}}, 0));
    }
    @Test
    void calculateTax4() {
        assertEquals(0.4,
                calculateTax(new int[][]{{2,5},{5,10},{10,15}}, 5),
                0.00001);
    }

    @Test
    void calculateTax5() {
        assertEquals(550.0,
                calculateTax(
                        new int[][]{
                                {100,10},{200,20},{300,30},{400,40},{500,50},
                                {600,60},{700,70},{800,80},{900,90},{1000,100}
                        },
                        1000
                ),
                0.00001);
    }
}