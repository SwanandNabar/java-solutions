package com.practice.GeeksForGeeks.Arrays;

public class RearrangeArray {

    public static int[] rearrange (int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                int x = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == x) {
                        int y = arr[x];
                        arr[i] = arr[j];
                        arr[j] = y;
                        break;
                    }
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr [] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};

        int arr1 [] = rearrange(arr);
        for (int i =0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
