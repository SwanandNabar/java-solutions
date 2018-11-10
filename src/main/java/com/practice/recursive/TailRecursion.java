package com.practice.recursive;

public class TailRecursion {
    static int factTR(int n, int a) {
        if (n == 1) return a;

        return factTR(n - 1, n * a);
    }

    // A wrapper over factTR
    static int fact(int n) {
        return factTR(n, 1);
    }

    // Driver code
    static public void main (String[] args) {
        System.out.println(fact(5));
    }
}
