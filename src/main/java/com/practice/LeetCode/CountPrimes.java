package com.practice.LeetCode;


public class CountPrimes {

    public static int countPrimes(int n) {

        int count = 1;

        for (int i = 3; i < n; i ++) {
            if (isPrime(i) == true) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime (int n) {

        if (n == 2) return true;
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; (i*i) <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
