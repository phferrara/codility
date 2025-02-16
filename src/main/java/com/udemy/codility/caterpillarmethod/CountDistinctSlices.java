package com.udemy.codility.caterpillarmethod;

import java.util.Arrays;

public class CountDistinctSlices {

    public int solution(int M, int[] A) {
        int count = 0;
        boolean[] duplicates = new boolean[M + 1];
        Arrays.fill(duplicates, false);

        int back = 0;
        for (int i = 0; i < A.length; i++) {
            if (duplicates[A[i]]) {
                while (duplicates[A[i]]) {
                    duplicates[A[back]] = false;
                    back++;
                }
            }
            count += (i - back) + 1;
            duplicates[A[i]] = true;
            if (count > 1_000_000_000) {
                return 1_000_000_000;
            }
        }

        return count;
    }
}
