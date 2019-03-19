package com.practice.Algorithms.DivideAndConquer;

public class MergeSort {

    public static void MergeSort(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

       // Temp array
        int leftArr [] = new int[n1];
        int rightArr [] = new int[n2];

        // copy to new array
        for (int i = 0 ; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Initialize pointers
        int i = 0, j = 0;

        int k = left;
        while(i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k++] = leftArr[i++];
        }
        while(j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void Merge(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            Merge(arr, left, mid);
            Merge(arr, mid + 1, right);
            MergeSort(arr,left, mid, right);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {7,4,5,2,3,1,6,0};
        int left = 0; int right = arr.length - 1;
        Merge(arr, left, right);
        printArray(arr);
    }
}
