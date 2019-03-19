package com.practice.LeetCode;

public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray (int arr[], int low, int high) {
        int lengthOfArray = arr.length;

        int mid = low + (high - low) / 2;

        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == lengthOfArray-1 || arr[mid +1] <= arr[mid])) {
            return mid;
        } else if (mid > 0 && arr[mid -1] > arr[mid]) {
            return peakIndexInMountainArray(arr, 0, mid -1);
        } else {
            return  peakIndexInMountainArray(arr, mid, lengthOfArray -1);
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,3,4,20,1,0};
        System.out.println( peakIndexInMountainArray(arr, 0, arr.length - 1));
    }
}
