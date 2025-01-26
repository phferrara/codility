package com.udemy.codility.countingelements;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int counter = X;
        boolean pos[] = new boolean[X + 1];

        for (int i = 0; i < A.length; i++) {
            int posRiver = A[i];
            if (!pos[posRiver]) {
                pos[posRiver] = true;
                counter--;
                if (counter == 0) {
                    return i;
                }
            }
        }

        return -1;
    }
}
