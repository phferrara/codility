package com.udemy.codility.countingelements;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        int starLine = 0;
        int currentMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                int pos = A[i] - 1;
                if (counters[pos] < starLine) {
                    counters[pos] = starLine + 1;
                } else {
                    counters[pos]++;
                }
                if (counters[pos] > currentMax) {
                    currentMax = counters[pos];
                }
            } else {
                starLine = currentMax;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < starLine)  {
                counters[i] = starLine;
            }
        }

        return counters;
    }
}
