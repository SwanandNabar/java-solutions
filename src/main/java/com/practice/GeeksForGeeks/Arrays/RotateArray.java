package com.practice.GeeksForGeeks.Arrays;

public class RotateArray {

    public void RotateArray (int[] arr , int k) {

        int l = arr.length, temp, previous;

        for (int i = 0; i < k; i++) {
            previous = arr[l-1];
            for (int j = 0; j < l; j ++) {
                temp = arr[j];
                arr[j] = previous;
                previous = temp;
            }

            System.out.println(arr[i]);
        }
    }

    public void rotate(int nums [], int rotateBy){
        int lengthOfArray = nums.length;
        while (lengthOfArray != 1 && rotateBy < lengthOfArray) {
            // left rotate
            reverseArray(nums, 0, rotateBy - 1);
            reverseArray(nums, rotateBy, lengthOfArray - 1);
            reverseArray(nums, 0, lengthOfArray - 1);

            // for right rotate make the 3rd call first and then the other two in the given order above
        }
    }

    public void reverseArray(int arrToReverse [], int startOfReverse, int endOfReverse){
        while (startOfReverse < endOfReverse) {
            int temp = arrToReverse[startOfReverse];
            arrToReverse[startOfReverse] = arrToReverse[endOfReverse];
            arrToReverse[endOfReverse] = temp;
            startOfReverse ++;
            endOfReverse --;
        }
    }
    public static void main(String[] args) {
        RotateArray rotateObj = new RotateArray();

        int a []= {1,2,3,4,5,6,7};
        int b [] = {-11};
//        rotateObj.RotateArray(a, 2);
        rotateObj.rotate(b, 2);
    }
}
