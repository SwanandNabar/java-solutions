package com.practice.GeeksForGeeks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        System.out.println("Elements " + queue);

        queue.remove();

        System.out.println("Elements after remove " + queue);

    }
}
