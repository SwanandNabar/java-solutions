package com.practice.GeeksForGeeks.Queue;

import java.util.Iterator;

public class PriorityQueue {

    public static void main(String[] args) {
    java.util.PriorityQueue<String> priorityQueue = new java.util.PriorityQueue<>();

        priorityQueue.add("C");
        priorityQueue.add("C++");
        priorityQueue.add("Java");
        priorityQueue.add("Python");

        // gives the element in the head of the priority Queue
        System.out.println("Head value using peek function: "  +priorityQueue.peek());

        System.out.println("The queue elements : ");
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove element from head of priorityQueue
        priorityQueue.poll();

        // Remove specific element from the priority Queue
        priorityQueue.remove("Java");

        // Check if an element is present using contains fuction

        boolean b = priorityQueue.contains("C");
        System.out.println("b " + b);

        // getting objects from the queue using toArray()

        Object[] arr = priorityQueue.toArray();
        System.out.println("Value in array :" );
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value : " + arr[i].toString());
        }



    }
}
