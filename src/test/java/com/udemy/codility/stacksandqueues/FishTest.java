package com.udemy.codility.stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    private final Fish fish = new Fish();

    @Test
    void solutionOneFishToTheRight() {
        // Given
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};

        // When
        int result = fish.solution(A, B);

        // Then
        assertEquals(2, result);
    }

    @Test
    void solutionTwoFishesToTheRight() {
        // Given
        int[] A = {4, 8, 2, 6, 7};
        int[] B = {0, 1, 1, 0, 0};

        // When
        int result = fish.solution(A, B);

        // Then
        assertEquals(2, result);
    }
}