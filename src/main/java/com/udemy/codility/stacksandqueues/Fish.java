package com.udemy.codility.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {
    public int solution(int[] A, int[] B) {
        Deque<Integer> stack = new ArrayDeque<>();
        int survivors = 0;

        for (int i = 0; i < B.length; i++) {
            int weight = A[i];
            if (B[i] == 1) {
                // go to right
                stack.push(weight);
            } else if (B[i] == 0) {
                // go the left
                int weightDown = stack.isEmpty() ? -1 : stack.pop();
                while (weightDown != -1 && weightDown < weight) {
                    weightDown = stack.isEmpty() ? -1 : stack.pop();
                }
                if (weightDown == -1) {
                    survivors++;
                } else {
                    stack.push(weightDown);
                }
            }
        }

        return survivors + stack.size();
    }

}
