package com.practice.GeeksForGeeks.LinkedList;

public class DeleteLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void deleteLinkedList () {
        head = null;
    }

    public void push (int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        DeleteLinkedList linkedList = new DeleteLinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(5);
        linkedList.push(456);

        System.out.println("Linked List is created");
        linkedList.deleteLinkedList();

        System.out.println("Linked List is deleted");


    }
}
