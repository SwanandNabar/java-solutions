package com.practice.GeeksForGeeks.Arrays;

public class MultipleLeftRotations {

    public static void multipleLeftRotation (int arr [], int numberOfRotations) {

        int lengthOfArray = arr.length;

        for (int i = numberOfRotations; i < numberOfRotations + lengthOfArray ; i ++) {
            System.out.println(arr[i % lengthOfArray] + " " );
            System.out.println("\n");
        }
    }

    public static void quickMultipleRotations (int arr[], int numberOfRotations) {
        int lengthOfArray = arr.length;
        int mod = 0;
        if (lengthOfArray != 0) {
             mod = numberOfRotations % lengthOfArray;
        }

        for (int i = 0 ; i < lengthOfArray ; i++) {
            System.out.println(arr[(i + mod) % lengthOfArray] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,3,4,5,6};
        multipleLeftRotation(arr, 4);
        multipleLeftRotation(arr, 3);
        multipleLeftRotation(arr, 12);
        int arr1[] = {};

        quickMultipleRotations(arr1, 0);

    }
}
