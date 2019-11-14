package com.practice.LeetCode;

public class SingleNonDuplicate {

    public static int singleNonDuplicate(int [] nums) {
        int lengthOfArr = nums.length;
        int counter = 0;

        for (int i = 0; i < lengthOfArr; i++) {
            if (nums[i] == nums[i+1]) {
                counter++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int arr [] = {1,1,2,3,3,4,4,5,5};
        int arr[] = {1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }
}
