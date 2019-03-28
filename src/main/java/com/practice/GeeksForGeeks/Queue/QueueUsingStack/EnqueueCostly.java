package com.practice.GeeksForGeeks.Queue.QueueUsingStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EnqueueCostly {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();


    // Enqueue item to the stacks (queue)
    public static void enQueue(int item) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // push item into s1
        s1.push(item);

        // push everything back to s1 from s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue an item from the queue
    public static int deQueue() {

        // if s1 is empty
        if (s1.isEmpty()) {
            return 0;
        }

        int result = s1.peek(); // takes a peek at the head element of the stack
        s1.pop();
        return result;
    }

    public static void main(String[] args) {
        EnqueueCostly enqueueCostly = new EnqueueCostly();

        enqueueCostly.enQueue(11);
        enqueueCostly.enQueue(12);
        enqueueCostly.enQueue(13);
        enqueueCostly.enQueue(14);
        enqueueCostly.enQueue(15);

        System.out.println(enqueueCostly.deQueue());
        System.out.println(enqueueCostly.deQueue());
        System.out.println(enqueueCostly.deQueue());

    }
}
