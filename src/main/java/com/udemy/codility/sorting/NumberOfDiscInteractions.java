package com.udemy.codility.sorting;

import java.util.Arrays;

public class NumberOfDiscInteractions {

    public int solution(int[] A) {
        int length = A.length;
        DiscLog[] discLogs = new DiscLog[length * 2];
        int j = 0;
        for (int i = 0; i < length; i++) {
            discLogs[j++] = new DiscLog(i - (long) A[i], 1);
            discLogs[j++] = new DiscLog(i + (long) A[i], -1);
        }
        discLogs = Arrays.stream(discLogs)
                .sorted((p1, p2) -> p1.x != p2.x ? Long.compare(p1.x, p2.x) : Integer.compare(p2.startEnd, p1.startEnd))
                .toArray(DiscLog[]::new);

        int intersections = 0;
        int activeIntersections = 0;
        for (DiscLog discLog : discLogs) {
            activeIntersections += discLog.startEnd;
            if (discLog.startEnd> 0) intersections += activeIntersections - 1;
            if (intersections > 10_000_000) return -1;
        }
        return intersections;
    }

    static class DiscLog {
        final long x;
        final int startEnd;

        public DiscLog(final long x, final int startEnd) {
            this.x = x;
            this.startEnd = startEnd;
        }
    }

}
