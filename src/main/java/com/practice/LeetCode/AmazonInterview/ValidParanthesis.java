package com.practice.LeetCode.AmazonInterview;

import java.util.*;

public class ValidParanthesis {

    public static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        char[] process = s.toCharArray();
        char temp;

        for (int i = 0 ; i < process.length; i++) {

            if (process[i] == '(' || process[i] == '[' || process[i] == '{') {
                stack.push(process[i]);
            } else {
                if (stack.isEmpty()) return false;
                temp = stack.getFirst();
                if (temp == '(' && process[i] == ')') {
                    stack.pop();
                } else if (temp == '[' && process[i] == ']') {
                    stack.pop();
                } else if (temp == '{' && process[i] == '}') {
                    stack.pop();
                } else {
                    stack.push(process[i]);
                }
            }
        }

        if (stack.isEmpty()) return true;

        return false;
    }


    public static void main(String[] args) {
        String s = "]";

        System.out.println(isValid(s));
    }
}
