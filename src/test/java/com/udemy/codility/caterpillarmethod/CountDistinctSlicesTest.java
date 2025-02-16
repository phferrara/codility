package com.udemy.codility.caterpillarmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDistinctSlicesTest {

    private CountDistinctSlices countDistinctSlices = new CountDistinctSlices();

    @Test
    void solution() {
        // Given
        int M = 6;
        int[] A = new int[] {3, 4, 5, 5, 2};

        // When
        int result = countDistinctSlices.solution(M, A);

        // Then
        assertEquals(9, result);
    }

    @Test
    void solution2() {
        // Given
        int M = 9;
        int[] A = new int[] {2, 4, 1, 7, 4, 9, 7, 3, 5, 5, 8, 7, 1};

        // When
        int result = countDistinctSlices.solution(M, A);

        // Then
        assertEquals(39, result);
    }
}