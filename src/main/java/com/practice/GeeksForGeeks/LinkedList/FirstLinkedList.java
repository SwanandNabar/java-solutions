package com.practice.GeeksForGeeks.LinkedList;

public class FirstLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        FirstLinkedList linkedList = new FirstLinkedList();

        linkedList.head = new Node(1);
        Node second = new  Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;
    }
}
