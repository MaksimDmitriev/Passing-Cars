package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void small() {
        Solution solution = new Solution();
        assertEquals(5, solution.solution(new int[]{0, 1, 0, 1, 1}));
    }
}