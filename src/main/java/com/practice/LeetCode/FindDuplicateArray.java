package com.practice.LeetCode;

import java.util.Arrays;

public class FindDuplicateArray {

    public static int findDuplicate (int [] arr) {

        int lengthOfArr = arr.length;

        Arrays.sort(arr);

        for (int i =0 ; i < lengthOfArr-1; i++) {
            if (arr[i] == arr[i+1]) {
                return arr[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,3};
        System.out.println(findDuplicate(arr));
    }
}
