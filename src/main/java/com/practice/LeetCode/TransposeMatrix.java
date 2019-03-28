package com.practice.LeetCode;

public class TransposeMatrix {

    public static int[][] transpose(int [][] A) {
        int [][] ans = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                ans[j][i] = A[i][j];
            }
            System.out.println(Math.random());
        }

        return ans;
    }

    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(A);
    }
}
