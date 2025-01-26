package com.udemy.codility.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {

    public int solution(String S) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : S.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else if ((c == '}' && (stack.isEmpty() || stack.pop().compareTo('{') != 0))) return 0;
            else if ((c == ')' && (stack.isEmpty() || stack.pop().compareTo('(') != 0))) return 0;
            else if ((c == ']' && (stack.isEmpty() || stack.pop().compareTo('[') != 0))) return 0;
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
