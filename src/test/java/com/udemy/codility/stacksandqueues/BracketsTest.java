package com.udemy.codility.stacksandqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    private final Brackets brackets = new Brackets();

    @Test
    void solution() {
        // Given
        String input = "[{([])}]";

        // When
        int result = brackets.solution(input);

        // Then
        assertEquals(1, result);
    }

    @Test
    void solutionNotNested() {
        // Given
        String input = "[{(})]";

        // When
        int result = brackets.solution(input);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionNotEmpty() {
        // Given
        String input = "[{()}";

        // When
        int result = brackets.solution(input);

        // Then
        assertEquals(0, result);
    }

    @Test
    void solutionEmpty() {
        // Given
        String input = "";

        // When
        int result = brackets.solution(input);

        // Then
        assertEquals(1, result);
    }
}