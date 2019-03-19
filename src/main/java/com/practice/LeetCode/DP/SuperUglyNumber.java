package com.practice.LeetCode.DP;

public class SuperUglyNumber {

    public static int nthSuperUglyNumber (int n, int[] primes) {

        int next_multiple = 1;
        int next_ugly = 1;

        int ugly [] = new int [n - primes.length];

        for (int i = 0 ; i < n; i++) {

            next_multiple = primes[i] * next_multiple;
            next_ugly = Math.min(next_multiple,primes[i+1]);

            if (next_ugly == next_multiple) {
                next_multiple = ugly[primes[next_ugly++]] * next_multiple;
            }
        }

        return next_multiple;

    }

    public static void main(String[] args) {
        int n = 12;
        int primes[] = {2,7,13,19};

        System.out.println(nthSuperUglyNumber(n, primes));
    }
}
