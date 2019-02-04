package com.practice.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDuplicate {

    public static boolean duplicate(int arr[])  {

        int lengthOfArr = arr.length;

        Arrays.sort(arr);

        for (int i =0 ; i < lengthOfArr-1; i++) {
            if (arr[i] == arr[i+1]) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int arr [] = {1,3,4,3,5,6};
        System.out.println(duplicate(arr));
    }
}
