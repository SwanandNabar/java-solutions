package com.practice.GeeksForGeeks.Arrays;

public class RotationCountSortedArray {

    /*
        This program calculates number of times the sorted array is rotated.
     */

    public static int rotationCount(int arr[]) {
        int count = arr[0], index = -1;

        for (int i = 0; i < arr.length ; i ++) {
            if (count > arr[i]) {
                index = i;
                return index;
            }

        }
        return index;
    }

    public static int rotationCount (int arr[], int low, int high) {

        if (high < low) {
            return arr[0];
        }

        if (high == low) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        if (mid < high && arr[mid + 1] < arr[mid]) {
            return arr[mid + 1];
        }

        if (mid > low && arr[mid] < arr[mid - 1]){
            return arr[mid];
        }

        if (arr[high] > arr[mid]) {
            return rotationCount(arr, low, mid -1);
        }

        return rotationCount(arr, mid + 1, high);
    }


    public static void main(String[] args) {

        int arr[] = {14,15,12,3,4};
        int n = arr.length;
        //int arr[] = {6,7,8,9,1};
        System.out.println(rotationCount(arr, 0, n-1));
    }
}
