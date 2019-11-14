package com.practice.LeetCode.AmazonInterview;

public class IntersectionLinkedList {

    static Node head;
    static Node slow_ptr , fast_ptr;

    static class Node {
        Node next;
        int data;

        Node(int d) {
            d = data;
            next = null;
        }
    }

    public static Node getIntersectLinkedList (Node headA, Node headB) {

        Node slow_ptr = headA;
        Node fast_ptr = headB;

        while (slow_ptr != fast_ptr) {
            slow_ptr = (slow_ptr != null) ? slow_ptr.next : headB;
            fast_ptr = (fast_ptr != null) ? fast_ptr.next : headA;
        }

        return slow_ptr;

    }

    public static void main(String[] args) {

    }
}
