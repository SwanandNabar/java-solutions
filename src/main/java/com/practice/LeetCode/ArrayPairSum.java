package com.practice.LeetCode;

import java.util.Arrays;

public class ArrayPairSum {

    public static int arrayPairSum (int [] arr) {

        int sum = 0, lengthOfArr = arr.length;
        Arrays.sort(arr);

        for (int i =0; i < lengthOfArr-1; i++) {
            for (int j = 0; j < lengthOfArr - 1; j++) {
                sum = Math.min(arr[i], arr[j+1]) + Math.min(arr[j] , arr[i+1]);
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        int arr[] = {4,1,3,2};
        System.out.println(arrayPairSum(arr));
    }
}
