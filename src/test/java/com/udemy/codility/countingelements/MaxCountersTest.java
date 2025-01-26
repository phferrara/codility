package com.udemy.codility.countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    private final MaxCounters maxCounters = new MaxCounters();

    @Test
    void solution() {
        // Given
        int X = 5;
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};

        // When
        int[] result = maxCounters.solution(X, A);

        // Then
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, result);
    }

    @Test
    void solutionNoMax() {
        // Given
        int X = 5;
        int[] A = new int[]{3, 4, 4, 1, 4, 4};

        // When
        int[] result = maxCounters.solution(X, A);

        // Then
        assertArrayEquals(new int[]{1, 0, 1, 4, 0}, result);
    }

    @Test
    void solutionSameElements() {
        // Given
        int X = 5;
        int[] A = new int[]{4, 4, 4, 4, 4, 4, 6};

        // When
        int[] result = maxCounters.solution(X, A);

        // Then
        assertArrayEquals(new int[]{6, 6, 6, 6, 6}, result);
    }

    @Test
    void solutionSameElementsNoMax() {
        // Given
        int X = 5;
        int[] A = new int[]{4, 4, 4, 4, 4, 4, 4};

        // When
        int[] result = maxCounters.solution(X, A);

        // Then
        assertArrayEquals(new int[]{0, 0, 0, 7, 0}, result);
    }

    @Test
    void solutionEmpty() {
        // Given
        int X = 0;
        int[] A = new int[]{};

        // When
        int[] result = maxCounters.solution(X, A);

        // Then
        assertArrayEquals(new int[]{}, result);
    }
}