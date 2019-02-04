package com.practice.LeetCode;

public class MoveZeros {

    public static void moveZeroes(int[] arr) {

        int write_index=0;

        for(int i =0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[write_index] = arr[i];
                write_index++;
            }
        }

        for(int j = write_index; j < arr.length; j++) {
            arr[j] = 0;
        }
    }

    public static void main(String[] args) {

        int arr[] = {0,2,0,3,0,12};

        moveZeroes(arr);

    }
}
