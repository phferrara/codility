package com.udemy.codility.timecomplexity;

public class TapeEquilibrium {

    int solution(int[] arr) {

        int sumLeft = arr[0];
        int sumRight = 0;
        for (int i = 1; i < arr.length; i++) {
            sumRight += arr[i];
        }

        int diff = Math.abs(sumLeft - sumRight);
        if (arr.length == 2) {
            return diff;
        }

        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i];
            sumRight -= arr[i];
            int currentDiff = Math.abs(sumLeft - sumRight);
            if (currentDiff < diff) {
                diff = currentDiff;
            }
        }

        return diff;
    }
}
