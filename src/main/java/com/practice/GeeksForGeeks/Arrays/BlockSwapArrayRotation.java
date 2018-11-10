package com.practice.GeeksForGeeks.Arrays;


/*
This program can be used to rotate the array by any number provided to the rotate function.
This will rotate the program to the right.
eg, {1,2,3,4,5,6,7} will be {6,7,1,2,3,4,5} after rotating by 2 to the right
 */

/*
Block swap array rotation and Reverse array rotation are the same logic
 */

public class BlockSwapArrayRotation {

    public static void rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0 , arr.length - 1);
        reverse(arr, 0, k -1);
        reverse(arr, k, arr.length -1);
    }


    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr,2);
    }
}
