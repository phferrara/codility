package com.udemy.codility.caterpillarmethod;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    public int solution(int[] A) {
        Arrays.sort(A);
        int sum = Integer.MAX_VALUE;

        int tail = 0;
        int head = A.length - 1;
        while (tail <= head) {
            int intSum = A[head] + A[tail];
            int absSum = Math.abs(intSum);
            if (absSum == 0) return 0;
            sum = Math.min(Math.abs(intSum), sum);
            if (intSum > 0) {
                head--;
            } else {
                tail++;
            }
        }

        return sum;
    }
}
