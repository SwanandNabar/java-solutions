package com.practice.GeeksForGeeks.Hashing;

public class HashTableBasic {

    final static int MAX = 1000;

    static boolean [][] hash = new boolean[MAX+1][2];

    static boolean search(int X) {
        if (X >= 0) {
            if (hash[X][0]) {
                return true;
            } else {
                return false;
            }
        }

        X = Math.abs(X);
        if (hash[X][1]) {
            return true;
        }
        return false;
    }

    static void insert (int a[], int n) {
        for (int i = 0; i <n; i++) {
            if (a[i] >= 0) {
                hash[a[i]][0] = true;
            } else {
                hash[Math.abs(a[i])][1] = true;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {-1, 9, -5, -8, -5, -2};
        int n = a.length;
        insert(a, n);
        int X = -5;
        if (search(X)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }
}
