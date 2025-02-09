package com.udemy.codility.prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivCountTest {

    private final DivCount divCount = new DivCount();

    @Test
    void solution() {
        // Given
        int A = 4;
        int B = 17;
        int K = 3;

        // When
        int result = divCount.solution(A, B, K);

        // Then
        assertEquals(4, result);
    }

    @Test
    void solution2() {
        // Given
        int A = 6;
        int B = 12;
        int K = 2;

        // When
        int result = divCount.solution(A, B, K);

        // Then
        assertEquals(4, result);
    }

    @Test
    void solutionNone() {
        // Given
        int A = 4;
        int B = 5;
        int K = 3;

        // When
        int result = divCount.solution(A, B, K);

        // Then
        assertEquals(0, result);
    }
}