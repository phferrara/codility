package com.udemy.codility.caterpillarmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAbsSumOfTwoTest {

    private MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    @Test
    void solution() {
        // Given
        int[] A = new int[] {1, 4, -3};

        // When
        int result = minAbsSumOfTwo.solution(A);

        // Then
        assertEquals(1, result);
    }

    @Test
    void solution2() {
        // Given
        int[] A = new int[] {-8, 4, 5, -10, 3};

        // When
        int result = minAbsSumOfTwo.solution(A);

        // Then
        assertEquals(3, result);
    }

    @Test
    void solution3() {
        // Given
        int[] A = new int[] {-22, 3, 4, 5};

        // When
        int result = minAbsSumOfTwo.solution(A);

        // Then
        assertEquals(6, result);
    }

    @Test
    void solutionOnlyPositive() {
        // Given
        int[] A = new int[] {3, 4, 5, 9};

        // When
        int result = minAbsSumOfTwo.solution(A);

        // Then
        assertEquals(6, result);
    }
}