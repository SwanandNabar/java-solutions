package com.practice.LeetCode;

public class RemoveElement {

    public static int removeElement (int[] nums, int val) {

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int arr []= {1,3,4,4,2,4,0,0};

        System.out.println(removeElement(arr,4));
    }
}
