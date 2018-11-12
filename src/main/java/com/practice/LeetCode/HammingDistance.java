package com.practice.LeetCode;

public class HammingDistance {

    /*
        Solution rotates the given int to right by 1 till they are 0. This increments the count on how many loops it takes to rotate the
        int till both of them become 0. The total count in the end is the max hamming distance
     */

    public static int hammingDistance (int x, int y) {
        int count = 0;
        while((x > 0) || (y > 0)) {
            count += ((x ^ y) & 1);
            x >>>= 1; y >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        hammingDistance(1,4);
    }
}
