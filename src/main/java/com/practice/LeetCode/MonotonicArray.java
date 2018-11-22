package com.practice.LeetCode;

public class MonotonicArray {

    public static boolean isMonotonicArray (int arr[]) {

        int lengthOfArray = arr.length;
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < lengthOfArray -1; i++) {
            if (arr[i] < arr[i+1]) {
                decreasing = false;
            }
            if (arr[i] > arr[i + 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,4};
        System.out.println(isMonotonicArray(arr));
    }
}
