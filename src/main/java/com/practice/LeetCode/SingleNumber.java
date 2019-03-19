package com.practice.LeetCode;

import java.util.HashMap;

public class SingleNumber {

    public static int[] singleNumber(int[] nums) {
        int newArr[] = {0,0}, countA = 0;

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int c : nums) {
            count.put(c, count.containsKey(c) ? (count.get(c) + 1) : 1);
        }

        for (int k : count.keySet()) {
            if (count.get(k)  == 1) {
                newArr[countA] = k;
                countA++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1,3,2,5};
        System.out.println(singleNumber(nums));
    }
}
