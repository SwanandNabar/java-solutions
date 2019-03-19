package com.practice.LeetCode;

import java.util.Arrays;

public class KthLargestElementArray {

    public static int kthLargestElement (int[] arr, int k) {
        int val = 0;
        Arrays.sort(arr);

        if (arr.length - k > 0) {

            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    val++;
                    if (val == k) {
                        return arr[i];
                    }
                }
            }
        }
        return val;
    }

    public static void main(String[] args) {

        int arr [] = {1,3,4,2,2,4,5,6};
        kthLargestElement(arr, 3);
    }
}
