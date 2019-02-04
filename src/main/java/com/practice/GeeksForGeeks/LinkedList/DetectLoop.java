package com.practice.GeeksForGeeks.LinkedList;

public class DetectLoop {

    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }

    }

    public static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static boolean detectLoop () {

        Node slow_p = head , fast_p = head;
        while(slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("true");
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        DetectLoop detectLoop = new DetectLoop();

        detectLoop.push(1);
        detectLoop.push(2);
        detectLoop.push(3);
        detectLoop.push(4);
        detectLoop.push(5);

        detectLoop.head.next.next.next.next.next = detectLoop.head;

        detectLoop.detectLoop();
    }
}
