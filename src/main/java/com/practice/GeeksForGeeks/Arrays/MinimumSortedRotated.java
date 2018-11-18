package com.practice.GeeksForGeeks.Arrays;

public class MinimumSortedRotated {

    /*
        Find the minimum value in a sorted and rotated array with distinct value.
        Find the index at which rotations started
        Find the total number of rotations on the given sorted and rotated array (rotated left? or right?)
     */

    public static int minimumSortedRotated(int arr []) {

        /*
            This logic checks and works for both - distinct and duplicate elements in the array
         */
        int lengthOfArray = arr.length;
        int min_value = 0;

        if (lengthOfArray != 0) {
            min_value = arr[0];
            for (int i = 0; i < lengthOfArray; i ++) {
                if (min_value > arr[i]){
                    min_value = arr[i];
                    return min_value;
                }
            }
        }
        return min_value;
    }

    public static void main(String[] args) {
//        int arr [] = {5,6,7,1,2,3,4};
        int arr[] = {3,6,3,3,10,10,1,10};
        System.out.println(minimumSortedRotated(arr));
    }
}
