package com.practice;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int SOI;
        for (int x = 0; x < nums.length; x ++) {
            for (int y = x + 1; y < nums.length; y ++) {
                if (x != y) {
                    SOI = nums[x] + nums[y];
                    if (target == SOI) {
                        return new int[]{x, y};
                    }
                }
            }
        }


        return new int[]{-1};
    }
    public static void main(String[] args) {
        int a [] = {1,3,4,6};
        twoSum(a, 8);
    }
}
