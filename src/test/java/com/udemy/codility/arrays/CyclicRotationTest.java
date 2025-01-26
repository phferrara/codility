package com.udemy.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CyclicRotationTest {

    private final CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    void cyclicRotation() {
        // Given
        int[] arr = {3, 8, 9, 7, 6};

        // When
        int[] rotatedArray = cyclicRotation.solution(arr, 3);

        // Then
        assertThat(rotatedArray).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }

    @Test
    void cyclicRotationEmpty() {
        // Given
        int[] arr = {};

        // When
        int[] rotatedArray = cyclicRotation.solution(arr, 2);

        // Then
        assertThat(rotatedArray).isEqualTo(new int[]{});
    }

    @Test
    void cyclicRotationTwoElements() {
        // Given
        int[] arr = {7, 2};

        // When
        int[] rotatedArray = cyclicRotation.solution(arr, 2);

        // Then
        assertThat(rotatedArray).isEqualTo(new int[]{7, 2});
    }

    @Test
    void cyclicRotationOnlyZeros() {
        // Given
        int[] arr = {0, 0, 0};

        // When
        int[] rotatedArray = cyclicRotation.solution(arr, 3);

        // Then
        assertThat(rotatedArray).isEqualTo(new int[]{0, 0, 0});
    }
}