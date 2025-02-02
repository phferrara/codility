package com.udemy.codility.maximumsliceproblem;

public class MaxProfit {

    public int solution(int[] A) {
        if (A == null || A.length == 0) return 0;

        int maxGlobalSum = 0;
        int maxLocalSum = 0;
        for (int i = 1; i < A.length; i++) {
            int diff = A[i] - A[i - 1];
            maxLocalSum = Math.max(diff + maxLocalSum, diff);
            maxGlobalSum = Math.max(maxLocalSum, maxGlobalSum);
        }

        return maxGlobalSum;
    }
}
