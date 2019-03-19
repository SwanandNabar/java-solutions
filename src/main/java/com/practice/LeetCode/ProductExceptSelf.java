package com.practice.LeetCode;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int lenOfArr = nums.length;
        int [] ret = new int[lenOfArr];

        if (lenOfArr == 0) {
            return ret;
        }

        int prefix = 1;
        for (int i = 0; i < lenOfArr; i++) {
            ret[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int j = lenOfArr -1; j >=0; j--) {
            ret[j] *= suffix;
            suffix *= nums[j];
        }

        return ret;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        productExceptSelf(arr);
    }
}
