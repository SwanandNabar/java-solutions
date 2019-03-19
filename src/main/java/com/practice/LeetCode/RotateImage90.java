package com.practice.LeetCode;

public class RotateImage90 {

    public static int[][] rotateImage90 (int [][] arr) {

        int lengthOfArray = arr.length;
        int ret[][] = new int[lengthOfArray][lengthOfArray];
        int start = 0;
        for (int j =0; j < lengthOfArray; j++) {
            for (int i = lengthOfArray -1; i >=0; i--) {
                ret[j][start] = arr[i][j];
                 start++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int arr [][] ={{1,2,3},{4,5,6},{7,8,9}};
        rotateImage90(arr);
    }
}
