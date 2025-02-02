package com.udemy.codility.leader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominatorTest {

    private final Dominator dominator = new Dominator();

    @Test
    void solution() {
        // Given
        int[] A = new int[]{3, 0, 1, 1, 4, 1, 1};

        // When
        int result = dominator.solution(A);

        // Then
        assertEquals(6, result);
    }

    @Test
    void solutionSingle() {
        // Given
        int[] A = new int[]{3};

        // When
        int result = dominator.solution(A);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionNone() {
        // Given
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7};

        // When
        int result = dominator.solution(A);

        // Then
        assertEquals(-1, result);
    }


    @Test
    void solutionEmpty() {
        // Given
        int[] A = new int[]{};

        // When
        int result = dominator.solution(A);

        // Then
        assertEquals(-1, result);
    }
}