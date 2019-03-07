package com.practice.LeetCode;

import java.util.Arrays;

public class FlipAndInvertImage {

    public static int[][] flipAndInvertImage (int [][] arr) {

        int lengthOfArray = arr.length;
        int lengthOfInnerArray = arr[0].length;

        for (int i = 0; i < lengthOfArray; i++) {
            for (int j = 0; j < lengthOfInnerArray / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][lengthOfInnerArray - 1 - j];
                arr[i][lengthOfInnerArray - 1 - j] = temp;
            }

        }

        for (int i =0; i < lengthOfArray; i++) {
            for (int j = 0; j < lengthOfInnerArray; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int arr [][] = {{1,1,0},{1,0,1},{0,0,0}};
        int arr [][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println("Input");
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
        System.out.println("output");
        Arrays.stream(flipAndInvertImage(arr)).map(Arrays::toString).forEach(System.out::println);
    }
}
