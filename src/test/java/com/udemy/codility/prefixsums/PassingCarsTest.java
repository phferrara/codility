package com.udemy.codility.prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {

    private final PassingCars passingCars = new PassingCars();

    @Test
    void solution() {
        // Given
        int[] A = new int[] {0, 1, 0, 1, 1};

        // When
        int result = passingCars.solution(A);

        // Then
        assertEquals(5, result);
    }

    @Test
    void solutionEmpty() {
        // Given
        int[] A = new int[] {};

        // When
        int result = passingCars.solution(A);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionSingle() {
        // Given
        int[] A = new int[] {1};

        // When
        int result = passingCars.solution(A);

        // Then
        assertEquals(0, result);
    }
}