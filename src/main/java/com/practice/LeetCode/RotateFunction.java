package com.practice.LeetCode;


/*
    This is the rotate function in regards to finding the max sum of i * arr[i]
 */
public class RotateFunction {

    public static int maxSum (int arr []) {

        int n = arr.length;
        int sum = 0;
        int i;
        int pivot = findPivot(arr);

        // difference in pivot and index of
        // last element of array
        int diff = n - 1 - pivot;
        for (i = 0; i < n; i++) {
            sum = sum + ((i + diff) % n) * arr[i];
        }
        return sum;
    }




    // function to find pivot
    public static int findPivot (int arr1[]){
        int n = arr1.length;
        int i;
        for (i = 0; i < n; i++) {
            if (arr1[i] > arr1[(i + 1) % n])
                return i;
        }
        return 0;
    }


    public static void main(String[] args) {
        int arr[] = {4,15,14,3,14,-8,12,-9,17,-1,15,1,10,19,-7,15,8,7,-8,11};
        System.out.println(maxSum(arr));
    }
}


