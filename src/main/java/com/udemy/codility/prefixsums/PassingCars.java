package com.udemy.codility.prefixsums;

public class PassingCars {

    public int solution(int[] A) {

        // O goes east, 1 goes west
        int length = A.length;
        int[] suffixSum = new int[length + 1];

        suffixSum[length] = 0;
        int count = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            suffixSum[i] = A[i] + suffixSum[i + 1];
            if (A[i] == 0) count += suffixSum[i];
            if (count > 1_000_000_000) return -1;
        }

        return count;
    }
}
