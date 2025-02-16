package com.udemy.codility.euclidian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolatesByNumbersTest {

    private final ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();

    @Test
    void solution() {
        // Given
        int N = 10;
        int M = 4;

        // When
        int result = chocolatesByNumbers.solution(N, M);

        // Then
        assertEquals(5, result);
    }

    @Test
    void solution2() {
        // Given
        int N = 9;
        int M = 6;

        // When
        int result = chocolatesByNumbers.solution(N, M);

        // Then
        assertEquals(3, result);
    }

    @Test
    void solution3() {
        // Given
        int N = 10;
        int M = 11;

        // When
        int result = chocolatesByNumbers.solution(N, M);

        // Then
        assertEquals(10, result);
    }
}