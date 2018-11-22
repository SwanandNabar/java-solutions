package com.practice.GeeksForGeeks.LinkedList;

public class LinkedListInsert {

    static Node head;

    // Linked List Node class
    static class Node {
        int data;
        Node next;

        Node (int d) {
            data = d;
            next = null;
        }
    }

    // LinkedList push

    public static void push(int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;
    }


    // LinkedList insertAfter

    public static void insertAfter(Node prev_node, int new_data) {

        if (prev_node != null) {
            Node new_node = new Node(new_data);

            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }
    }

    // LinkedList append

    public static void append(int new_data) {

        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    // print LinkedList

    public static void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {
        LinkedListInsert linkedListInsert = new LinkedListInsert();

        linkedListInsert.append(6);
        linkedListInsert.push(4);
        linkedListInsert.push(7);
        linkedListInsert.insertAfter(linkedListInsert.head.next,8);
        linkedListInsert.append(10);
        linkedListInsert.printList();

    }
}
