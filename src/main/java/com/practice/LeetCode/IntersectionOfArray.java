package com.practice.LeetCode;

public class IntersectionOfArray {

    public static int [] intersectionOfArray(int nums1[], int nums2[]) {

        int lengthOfA1 = nums1.length;
        int lengthOfA2 = nums2.length;

        int i = 0, j = 0;

        while(i < lengthOfA1 && j < lengthOfA2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                j++;
                return new int[]{i++};
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};

        System.out.println(intersectionOfArray(nums1,nums2));
    }
}
