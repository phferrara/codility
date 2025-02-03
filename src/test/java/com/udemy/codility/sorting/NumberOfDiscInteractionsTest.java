package com.udemy.codility.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfDiscInteractionsTest {

    private final NumberOfDiscInteractions numberOfDiscInteractions = new NumberOfDiscInteractions();

    @Test
    void solution() {
        // Given
        int[] A = new int[]{1, 5, 2, 1, 4, 0};

        // When
        int result = numberOfDiscInteractions.solution(A);

        // Then
        Assertions.assertEquals(11, result);
    }

    @Test
    void solutionEmpty() {
        // Given
        int[] A = new int[]{};

        // When
        int result = numberOfDiscInteractions.solution(A);

        // Then
        Assertions.assertEquals(0, result);
    }

    @Test
    void solutionSingle() {
        // Given
        int[] A = new int[]{1};

        // When
        int result = numberOfDiscInteractions.solution(A);

        // Then
        Assertions.assertEquals(0, result);
    }

    @Test
    void solutionOne() {
        // Given
        int[] A = new int[]{1, 5};

        // When
        int result = numberOfDiscInteractions.solution(A);

        // Then
        Assertions.assertEquals(1, result);
    }
}