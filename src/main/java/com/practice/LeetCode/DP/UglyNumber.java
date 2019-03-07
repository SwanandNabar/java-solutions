package com.practice.LeetCode.DP;

public class UglyNumber {

    public static int nthUglyNumber(int n) {
        int ugly[] = new int[n]; // array of size given number

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        int next_multiple_of_2 = 2;
        int next_multiple_of_3 = 3;
        int next_multiple_of_5 = 5;

        int next_ugly_no = 1;

        ugly[0] = 1;

        // till we reach the given number add the numbers in the array created by taking the multiples and then check with the array if the number exists

        for (int i = 1; i < n; i++) {
            next_ugly_no = Math.min(next_multiple_of_2,Math.min(next_multiple_of_3,next_multiple_of_5));

            ugly[i] = next_ugly_no;

            if (next_ugly_no == next_multiple_of_2) {
                i2 = i2 + 1;
                next_multiple_of_2 = ugly[i2] * 2;
            }
            if (next_ugly_no == next_multiple_of_3) {
                i3 = i3 + 1;
                next_multiple_of_3 = ugly[i3] * 3;
            }
            if (next_ugly_no == next_multiple_of_5) {
                i5 = i5 + 1;
                next_multiple_of_5 = ugly[i5] * 5;
            }
        }

        return next_ugly_no;
    }

    public static boolean checkIfUglyNumber (int n) {
        if (n % 7 == 0) {
            return false;
        }
       if ((n % 2 == 0) || (n % 5 == 0) || (n % 3 == 0)) {
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        int n = 10;
//        System.out.println(nthUglyNumber(n));

        System.out.println(checkIfUglyNumber(16));
    }
}
