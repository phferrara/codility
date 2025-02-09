package com.udemy.codility.prefixsums;

public class DivCount {

    public int solution(int A, int B, int K) {
        return (int) (Math.floor(B / (double) K) - Math.ceil(A / (double) K) + 1);
    }
}
