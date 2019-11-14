package com.practice.GeeksForGeeks.Stack;

/**
 * @author swanandnabar
 */
public class Stack {

    private static final int MAX = 1000;
    private int top;
    private int a[] = new int[MAX];

    /**
     *
     * @return check if stack is empty
     */
    private boolean isEmpty() {
        return (top < 0);
    }

    /**
     * constructor
     */
    private Stack() {
        top = -1;
    }

    /**
     *
     * @param x takes an argument to push into stack
     */
    private void push(int x) {
        if(top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    /**
     *
     * @return returns the value that is popped out of top of stack
     */
    private int pop() {
        if (top < 0) {
            return 0;
        } else {
            return a[top--];
        }
    }

    /**
     *
     * @param args Driver method
     */
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);

        System.out.println(s.isEmpty());

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());

    }

}
