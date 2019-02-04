package com.practice.GeeksForGeeks.LinkedList;

public class DeleteDuplicate {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void deleteDuplicate() {
        Node current = head;

        Node next_next;

        if (head == null) {
            return;
        }

        while (current.next != null) {
            if (current.data == current.next.data) {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            } else {
                current = current.next;
            }
        }
    }

    public void push (int new_data) {
        DeleteDuplicate.Node new_node = new DeleteDuplicate.Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {

        DeleteDuplicate deleteDuplicate = new DeleteDuplicate();
        deleteDuplicate.push(1);
        deleteDuplicate.push(1);
        deleteDuplicate.push(1);
        deleteDuplicate.push(2);

        deleteDuplicate.deleteDuplicate();


    }
}
