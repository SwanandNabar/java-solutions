package com.practice.LeetCode;

public class HappyNumber {

    public static boolean isHappy(int num) {
        int sum = 0;

        if (num == 0) return false;

        while (num != 0) {
            int temp = num % 10;
            sum = sum + (temp * temp);
            num = num / 10;
            if (num == 0) {
                if (sum == 16) {
                    break;
                }
                if (sum == 1) {
                    return true;
                }
                num = sum;
                sum = 0;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
