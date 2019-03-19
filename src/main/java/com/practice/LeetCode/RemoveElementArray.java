package com.practice.LeetCode;

public class RemoveElementArray {

    public static int removeElement(int nums [], int val) {
        int lengthOfArr = nums.length;
        int counter = 0;

        for(int i = 0; i < lengthOfArr; i++) {
            if (nums[i] == val) {
                counter++;
                nums[i] = nums[i+1];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int arr [] = {1,3,4,5,3,4};
        System.out.println(removeElement(arr, 3));
    }
}
