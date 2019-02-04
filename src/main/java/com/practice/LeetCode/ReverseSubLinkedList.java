package com.practice.LeetCode;

public class ReverseSubLinkedList {

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverseSubLinkedList (Node head, int m, int n) {

        if (head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;

        while (m > 1) {
            prev = current;
            current = current.next;
            m--;
            n--;
        }

        Node con = prev, tail = current;
        Node third = null;

        while (n > 0) {
            third = current.next;
            current.next = prev;
            prev = current;
            current = third;
            n--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = current;

        return head;
    }

    public void push (int new_data) {
        ReverseSubLinkedList.Node new_node = new ReverseSubLinkedList.Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList () {
        ReverseSubLinkedList.Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {

        ReverseSubLinkedList reverseSubLinkedList = new ReverseSubLinkedList();

        reverseSubLinkedList.push(1);
        reverseSubLinkedList.push(2);
        reverseSubLinkedList.push(3);
        reverseSubLinkedList.push(4);
        reverseSubLinkedList.push(5);

        reverseSubLinkedList.printList();
        reverseSubLinkedList.reverseSubLinkedList(head, 2,4  );

        reverseSubLinkedList.printList();


    }
}
