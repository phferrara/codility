package com.udemy.codility.leader;

public class Dominator {

    public int solution(int[] A) {
        if (A == null || A.length == 0) return -1;

        int consecutiveSive = 1;
        int candidate = A[0];

        for (int i = 1; i < A.length; i++) {
            if (consecutiveSive == 0) {
                candidate = A[i];
                consecutiveSive++;
            } else if (A[i] != candidate) {
                consecutiveSive--;
            } else {
                consecutiveSive++;
            }
        }

        int candidateSize = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                candidateSize++;
                index = i;
            }
        }

        return candidateSize > A.length / 2 ? index : -1;
    }
}
