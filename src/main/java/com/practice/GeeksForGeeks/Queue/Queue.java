package com.practice.GeeksForGeeks.Queue;

/**
 * Class to create and modify Queue.
 */
public final class Queue {
    private int front, rear, size;
    private int capacity;
    private int array[];

    /**
     *
     * @param capacity Gets the capacity for initializing the Queue
     */
    private Queue(final int capacity) {
        this.capacity = capacity;
        front = 0;
        this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    /**
     *
     * @param queue Queue is full when size = capacity
     * @return will return true if full
     */
    private boolean isFull(final Queue queue) {
        return queue.size == queue.capacity;
    }

    /**
     *
     * @param queue Queue is empty when size is 0
     * @return will return true if empty
     */
    private boolean isEmpty(final Queue queue) {
        return queue.size == 0;
    }

    /**
     *
     * @param item add an item to the queue,  It changes the rear and size
     */
    private void enqueue(final int item) {
        if (isFull(this)) {
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size += 1;
        System.out.println(item + " enqueued to queue");
    }

    /**
     *
     * @return this will dequeue an item from front of the queue,
     * It changes the front and size
     */
    private int dequeue() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size -= 1;
        System.out.println(item + " Dequeued from queue");
        return item;
    }

    /**
     *
     * @return Method to get front of queue
     */
    private int front() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    /**
     *
     * @return Method to get rear of queue
     */
    private int rear() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }

    /**
     *
     * @param args Driver class arguments
     */
    public static void main(String[] args) {
        //Create an object of the class to call the methods of that class

        Queue queue = new Queue(1000);

        //Fill the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        //Get item from front
        System.out.println("Front " + queue.front());

        //Get item from rear
        System.out.println("Rear " + queue.rear());

        //Remove item from front
        System.out.println(queue.dequeue());


    }
}
