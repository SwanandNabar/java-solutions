package com.practice.GeeksForGeeks.Queue.QueueUsingStack;

import java.util.Stack;

public class OneStackQueue {

    static Stack<Integer> s1 = new Stack<>();

    public static void enQueue(int item) {
        s1.push(item);
    }

    public static int deQueue() {
        int temp, result;

        if(s1.isEmpty()) {
            return 0;
        } else if (s1.size() == 1) {
            return s1.pop();
        } else {
            temp = s1.pop();
            result = deQueue();
            s1.push(temp);
            return result;
        }
    }

    public static void main(String[] args) {
        OneStackQueue oneStackQueue = new OneStackQueue();

        oneStackQueue.enQueue(11);
        oneStackQueue.enQueue(12);
        oneStackQueue.enQueue(13);
        oneStackQueue.enQueue(14);
        oneStackQueue.enQueue(15);

        System.out.println(oneStackQueue.deQueue());
        System.out.println(oneStackQueue.deQueue());
        System.out.println(oneStackQueue.deQueue());
    }
}
