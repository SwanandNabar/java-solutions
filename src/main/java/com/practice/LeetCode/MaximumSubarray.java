package com.practice.LeetCode;

public class MaximumSubarray {

    public static int maxSubArray(int [] nums) {
        int start = 0;
        int end = nums.length;

        int mid = (start+end) / 2;

        while (start < end) {
            if (nums[start] < nums[end]) {
                return 0;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
