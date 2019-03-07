package com.practice.LeetCode;

import java.util.Arrays;

public class ArrayPairSum {

    public static int arrayPairSum (int [] arr) {

        int sum = 0, lengthOfArr = arr.length;

        Arrays.sort(arr);
        int num=0;
        for(int i = 0; i < arr.length; i += 2) {
            num+=arr[i];
        }
        return num;

//        for (int i =0; i < lengthOfArr/2; i++) {
//            for (int j = 0; j < lengthOfArr /2; j++) {
//                if (arr.length / 2 > 1) {
//                    sum = Math.min(arr[i], arr[j + 1]);
//                    //                System.out.println(i+j);
//                } else {
//                    sum = Math.min(arr[i], arr[j+1]);
//                }
//            }
//        }

//        return sum;
    }


    public static void main(String[] args) {
//        int arr[] = {4,1,3,2};
//        int arr[] = {1,1};
        int arr[] = {1,2,3,2};
        System.out.println(arrayPairSum(arr));
    }
}
