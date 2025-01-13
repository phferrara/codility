package com.udemy.codility.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TapeEquilibriumTest {

    private final TapeEquilibrium equilibrium = new TapeEquilibrium();

    @Test
    void findMissingElement() {
        // Given
        int[] arr = {3, 1, 2, 4, 3};

        // When
        int missingElement = equilibrium.solution(arr);

        // Then
        assertThat(missingElement).isEqualTo(1);
    }

    @Test
    void findMissingElementDouble() {
        // Given
        int[] arr = {-1000, 1000};

        // When
        int missingElement = equilibrium.solution(arr);

        // Then
        assertThat(missingElement).isEqualTo(2000);
    }

    @Test
    void findMissingElementQuadruple() {
        // Given
        int[] arr = {-1000, 1000, -500, 500};

        // When
        int missingElement = equilibrium.solution(arr);

        // Then
        assertThat(missingElement).isZero();
    }

}