package com.practice.LeetCode;

public class OddEvenLinkedList {

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node oddEvenLinkedList (Node head) {

        Node current = null;

        while (head != null) {
            current = head;
            current.next = head.next.next;
        }

        return head;
    }

    public void push (int new_data) {
        OddEvenLinkedList.Node new_node = new OddEvenLinkedList.Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList () {
        OddEvenLinkedList.Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

        oddEvenLinkedList.push(1);
        oddEvenLinkedList.push(2);
        oddEvenLinkedList.push(3);
        oddEvenLinkedList.push(4);
        oddEvenLinkedList.push(5);

        oddEvenLinkedList.printList();
        oddEvenLinkedList.oddEvenLinkedList(head);

        oddEvenLinkedList.printList();
    }
}
