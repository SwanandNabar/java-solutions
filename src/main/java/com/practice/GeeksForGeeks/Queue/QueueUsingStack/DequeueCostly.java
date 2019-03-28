package com.practice.GeeksForGeeks.Queue.QueueUsingStack;

import java.util.Stack;

public class DequeueCostly {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void enQueue(int item) {
        s1.push(item);
    }

    public static int deQueue() {
        int result;

        if (s1.isEmpty() && s2.isEmpty()) {
            return 0;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                result = s1.pop();
                s2.push(result);
            }
        }
        result = s2.pop();
        return result;
    }
    public static void main(String[] args) {
        DequeueCostly dequeueCostly = new DequeueCostly();

        dequeueCostly.enQueue(11);
        dequeueCostly.enQueue(12);
        dequeueCostly.enQueue(13);
        dequeueCostly.enQueue(14);
        dequeueCostly.enQueue(15);

        System.out.println(dequeueCostly.deQueue());
        System.out.println(dequeueCostly.deQueue());
        System.out.println(dequeueCostly.deQueue());
    }
}
