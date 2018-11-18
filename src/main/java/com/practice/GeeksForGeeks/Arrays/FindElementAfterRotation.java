package com.practice.GeeksForGeeks.Arrays;

public class FindElementAfterRotation {

    public static void findElementAfterRotation (int arr[],int range[][], int numberOfRotations, int index ) {

        for (int i = numberOfRotations - 1; i >= 0; i --) {
            int left = range[i][0];
            int right = range[i][1];

            if (left <= index && right >= index) {
                if (index == left){
                    index = right;
                } else {
                    index --;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int numberOfRotations = 2;
        int range [][] = {{0,2}, {0,3}};
        int index = 2;
        findElementAfterRotation(arr, range, numberOfRotations, index);
    }
}
