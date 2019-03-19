package com.practice.LeetCode;

public class PlusOneArray {

    public static int[] plusOne(int[] digits) {
        int lengthOfArr = digits.length;
        int carry = 0;

        if (digits[lengthOfArr - 1] == 9) {
            carry++;
            digits[lengthOfArr - 2] += carry;
        }
        if (lengthOfArr == 1 && digits[lengthOfArr - 1] == 9) {
            carry++;
            digits[lengthOfArr - 2] += carry;
        }
        digits[lengthOfArr - 1] = digits[lengthOfArr - 1] + 1;
        return digits;
    }

    public static void main(String[] args) {
        int arr [] = {1,3,4};
        System.out.println(plusOne(arr));
    }
}
