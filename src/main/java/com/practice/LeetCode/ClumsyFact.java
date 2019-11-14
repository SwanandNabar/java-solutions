package com.practice.LeetCode;

public class ClumsyFact {

    public static int clumsy(int N) {
        for (int i = 1; i < N; i++) {
            N  = N * (N - 1) / (N - 2) + (N -3) - (N - 4);
        }
        return N;
    }

    public static void main(String[] args) {
        System.out.println(clumsy(4));
    }
}
