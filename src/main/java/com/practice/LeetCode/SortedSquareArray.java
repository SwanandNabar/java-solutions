package com.practice.LeetCode;

public class SortedSquareArray {

    public static int[] sortedSquareArray (int arrToSort[]) {
        int lengthOfArray = arrToSort.length;

        // square of the array
        for (int i = 0; i < lengthOfArray; i++ ) {
            arrToSort[i] = arrToSort[i] * arrToSort[i];

            for (int j = 0; j < i; j++) {
                if (arrToSort[i] < arrToSort[j]) {
                    int temp = arrToSort[j];
                    arrToSort[j] = arrToSort[i];
                    arrToSort[i] = temp;
                }
            }
        }

        return arrToSort;
    }

    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
//        int arr[] = {-3,-2,0};
        sortedSquareArray(arr);

        for (int i = 0; i < arr.length ; i ++) {
            System.out.println(arr[i] + " ");
        }
    }
}
