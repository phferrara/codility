package com.udemy.codility.maximumsliceproblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    private final MaxProfit maxProfit = new MaxProfit();

    @Test
    void solution() {
        // Given
        int[] A = new int[]{23171, 21011, 21123, 21366, 21013, 21367};

        // When
        int result = maxProfit.solution(A);

        // Then
        assertEquals(356, result);
    }

    @Test
    void solutionSinglePositive() {
        // Given
        int[] A = new int[]{23171};

        // When
        int result = maxProfit.solution(A);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionTwo() {
        // Given
        int[] A = new int[]{23171, 21011};

        // When
        int result = maxProfit.solution(A);

        // Then
        assertEquals(0, result);
    }
}