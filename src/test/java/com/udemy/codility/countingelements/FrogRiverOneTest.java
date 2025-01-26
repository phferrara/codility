package com.udemy.codility.countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    private final FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    void solution() {
        // Given
        int X = 5;
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};

        // When
        int result = frogRiverOne.solution(X, A);

        // Then
        assertEquals(6, result);
    }

    @Test
    void solutionOneWidth() {
        // Given
        int X = 1;
        int[] A = new int[]{1, 1, 1};

        // When
        int result = frogRiverOne.solution(X, A);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionNone() {
        // Given
        int X = 3;
        int[] A = new int[]{1, 2, 1};

        // When
        int result = frogRiverOne.solution(X, A);

        // Then
        assertEquals(-1, result);
    }
}