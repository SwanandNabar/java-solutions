package com.practice.GeeksForGeeks.Arrays;

import java.util.Arrays;

public class LargetElementInArray {

    public static int largetElementInArray (int[] arr) {
        int val = 0;
        Arrays.sort(arr);
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i-1] <arr[i] ) {
                return arr[i];
            }
        }
        return val;

    }

    public static void main(String[] args) {

        int arr [] = {10,20,5};
        System.out.println(largetElementInArray(arr));

    }
}
