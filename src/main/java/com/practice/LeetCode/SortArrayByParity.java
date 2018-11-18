package com.practice.LeetCode;

public class SortArrayByParity {

    public static int [] sortArrayByParity (int arr[]) {

        int lengthOfArray = arr.length;

        int start = 0;
        int end = lengthOfArray -1;

        for (int i = 0; i < lengthOfArray; i++) {
            if (arr[i] % 2 == 0 && start < end) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int arr[] = {1,3,8,2,4,6,9};
//        int arr[] = {5,8,-1,0,3,20, 78,93, 9};
//        int arr[] = {0};
        int arr[] = {};

        int print []= sortArrayByParity(arr);
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(print[i]);
        }
    }
}
