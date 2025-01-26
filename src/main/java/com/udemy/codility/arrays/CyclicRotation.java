package com.udemy.codility.arrays;

public class CyclicRotation {

    int[] solution(int[] A, int k) {
        int length = A.length;
        int[] B = new int[length];

        for (int i = 0; i < A.length; i++) {
            B[(i + k) % length] = A[i];
        }

        return B;
    }
}
