package com.udemy.codility.timecomplexity;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PermMissingElementTest {

    private PermMissingElement permMissingElement;

    @BeforeEach
    void setUp() {
        permMissingElement = new PermMissingElement();
    }

    @Test
    void findMissingElementIfEmpty() {
        // Given
        int[] arr = {};

        // When
        int missingElement = permMissingElement.solution(arr);

        // Then
        assertThat(missingElement).isEqualTo(1);
    }

    @Test
    void findMissingElementIfLastMissingElement() {
        // Given
        int[] arr = {1, 5, 3, 2, 4, 6};

        // When
        int missingElement = permMissingElement.solution(arr);

        // Then
        assertThat(missingElement).isEqualTo(7);
    }

    @Test
    void findMissingElement() {
        // Given
        int[] arr = {1, 5, 3, 2};

        // When
        int missingElement = permMissingElement.solution(arr);

        // Then
        assertThat(missingElement).isEqualTo(4);
    }
}
