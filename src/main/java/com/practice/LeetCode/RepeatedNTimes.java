package com.practice.LeetCode;

import java.util.HashMap;

public class RepeatedNTimes {

    public static int repeatedNTimes(int [] A) {

        int N = A.length / 2;
        HashMap<Integer, Integer> repeatedElements = new HashMap<>();

        for (int elem : A) {
            repeatedElements.put(elem, repeatedElements.getOrDefault(elem,0) + 1);
        }

        for(int k : repeatedElements.keySet()) {
            if (repeatedElements.get(k) == N) {
                return  k;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int [] A = {1,2,3,3};
        System.out.println(repeatedNTimes(A));
    }
}
