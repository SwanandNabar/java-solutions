package com.practice.LeetCode.AmazonInterview;
import java.util.*;

public class KClosestPoints {

    public static int[][] kClosest(int[][] points, int k) {

        int[][] returnArray = new int[k][2];

        int N = points.length;
        int[] dist = new int[N];

        for(int i = 0; i < N; i++) {
            dist[i] = dists(points[i]);
        }

        Arrays.sort(dist);
        int distK = dist[k - 1];

        int t = 0;
        for (int i = 0; i < N; i++) {
            if (dists(points[i]) <= distK) {
                returnArray[t++] = points[i];
            }
        }

        return returnArray;

    }

    public static int dists(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public static void main(String[] args) {
        int[][] test = {{1,3},{-2,2}};
        int k = 1;
        kClosest(test, k);
    }
}
