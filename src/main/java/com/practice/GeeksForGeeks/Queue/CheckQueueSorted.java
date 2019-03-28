package com.practice.GeeksForGeeks.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckQueueSorted {

    static Stack<Integer> s1 = new Stack<>();
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();

    public static void addElementsToQueue(int item) {
        queue1.add(item);
        System.out.println("Queue 1 addElementsToQueue " + queue1);
    }

    public static void enQueue() {
        s1.push(queue1.poll());

        System.out.println("Stack enQueue " + s1);
        System.out.println("Queue 1 enQueue " + queue1);
        System.out.println("Queue 2 enQueue " + queue2);
    }

    public static void deQueue() {

        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        queue2.add(s1.pop());

        System.out.println("Stack deQueue" + s1);
        System.out.println("Queue 1 deQueue" + queue1);
        System.out.println("Queue 2 deQueue " + queue2);

    }

    public static void main(String[] args) {
        CheckQueueSorted checkQueueSorted = new CheckQueueSorted();

        checkQueueSorted.addElementsToQueue(5);
        checkQueueSorted.addElementsToQueue(1);
        checkQueueSorted.addElementsToQueue(2);
        checkQueueSorted.addElementsToQueue(3);
        checkQueueSorted.addElementsToQueue(4);

        checkQueueSorted.enQueue();
        checkQueueSorted.deQueue();
    }
}
