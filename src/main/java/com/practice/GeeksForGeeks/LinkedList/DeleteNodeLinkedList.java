package com.practice.GeeksForGeeks.LinkedList;

public class DeleteNodeLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }

    public void deleteNodeLinkedList(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    public void push (int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList () {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeLinkedList deleteLinkedList = new DeleteNodeLinkedList();
        deleteLinkedList.push(5);
        deleteLinkedList.push(6);
        deleteLinkedList.push(1);

        deleteLinkedList.printList();

        deleteLinkedList.deleteNodeLinkedList(6);

        deleteLinkedList.printList();
    }
}
