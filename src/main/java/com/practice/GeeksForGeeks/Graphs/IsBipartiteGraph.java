package com.practice.GeeksForGeeks.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class IsBipartiteGraph {

//    final static int V = 4;

    static boolean isBipartite(int graph[][]) {

        int V = graph.length;
        int colorArr[] = new int[V];

        for (int i = 0; i < V; i++) {
            if (colorArr[i] != 0) continue;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            colorArr[i] = 1;   // Blue: 1; Red: -1.

            while (!queue.isEmpty()) {
                int cur = queue.poll();
                for (int next : graph[cur]) {
                    if (colorArr[next] == 0) {          // If this node hasn't been colored;
                        colorArr[next] = -colorArr[cur];  // Color it with a different color;
                        queue.offer(next);
                    } else if (colorArr[next] != -colorArr[cur]) {   // If it is colored and its color is different, return false;
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int G[][] = {{1,3},{0,2},{1,3},{0,2}};

        System.out.println(isBipartite(G));

    }
}
