package com.udemy.codility.euclidian;

public class ChocolatesByNumbers {

    public int solution(int N, int M) {
        return N / findGcd(N, M);
    }

    private int findGcd(int A, int B) {
        if (B == 0) {
            return A;
        } else {
            return findGcd(B, A % B);
        }

    }
}
