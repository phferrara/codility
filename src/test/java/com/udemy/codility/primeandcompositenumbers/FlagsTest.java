package com.udemy.codility.primeandcompositenumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {

    private final Flags flags = new Flags();

    @Test
    void solution() {
        // Given
        int[] A = new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        // When
        int result = flags.solution(A);

        // Then
        assertEquals(3, result);
    }

    @Test
    void solution2() {
        // Given
        int[] A = new int[] {1, 5, 3, 4, 3, 4, 4, 4, 4, 4, 4, 4};

        // When
        int result = flags.solution(A);

        // Then
        assertEquals(2, result);
    }

    @Test
    void solutionEmpty() {
        // Given
        int[] A = new int[] {};

        // When
        int result = flags.solution(A);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionSingle() {
        // Given
        int[] A = new int[] {1};

        // When
        int result = flags.solution(A);

        // Then
        assertEquals(0, result);
    }
}