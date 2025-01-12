package com.udemy.codility.timecomplexity;

public class PermMissingElement {

    int solution(int[] arr) {
        long sum = 0;
        int max = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        return Math.toIntExact(((long) max * (max + 1)) / 2 - sum);
    }
}
