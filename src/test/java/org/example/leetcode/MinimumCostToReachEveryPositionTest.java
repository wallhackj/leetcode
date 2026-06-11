package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.example.leetcode.MinimumCostToReachEveryPosition.minCosts;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToReachEveryPositionTest {

    @Test
    void minCosts1() {
        assertEquals(new int[]{5,3,3,1,1,1}, minCosts(new int[]{5,3,4,1,3,2}));
    }
    @Test
    void minCosts2() {
        assertEquals(new int[]{1,1,1,1,1}, minCosts(new int[]{1,2,4,6,7}));
    }
    @Test
    void minCosts3() {
        assertEquals(new int[]{5,3,3,1,1,1}, minCosts(new int[]{5,3,4,1,3,2}));
    }
}