package com.practice.LeetCode;

public class AddTwoNumbersLinkedList {

    static ListNode head1, head2;

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int d) {
            data = d;
            next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode prev = null;
        ListNode temp = null;
        int carry = 0, sum;

        while (l1 != null || l2 != null) {
            sum = carry + (l1 != null ? l1.data : 0) + (l2 != null ? l2.data : 0);
            carry = sum / 10;
            sum = sum % 10;
            temp = new ListNode (sum);

            if (res == null) {
                res = temp;
            } else {
                prev.next = temp;
            }

            prev = temp;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return res;
    }

    public static void printList(ListNode head) { 
        while (head != null) { 
            System.out.print(head.data + " "); 
            head = head.next; 
        } 
        System.out.println("");
    } 

    public static void main(String[] args) {
        AddTwoNumbersLinkedList addTwoNumbersLinkedList = new AddTwoNumbersLinkedList();
        addTwoNumbersLinkedList.head1 = new ListNode(2);
        addTwoNumbersLinkedList.head1.next = new ListNode(4);
        addTwoNumbersLinkedList.head1.next.next = new ListNode(3);
        addTwoNumbersLinkedList.printList(head1);

        addTwoNumbersLinkedList.head2 = new ListNode(5);
        addTwoNumbersLinkedList.head2.next = new ListNode(6);
        addTwoNumbersLinkedList.head2.next.next = new ListNode(4);
        addTwoNumbersLinkedList.printList(head2);

        ListNode result = addTwoNumbersLinkedList.addTwoNumbers(head1, head2);
        addTwoNumbersLinkedList.printList(result);

    }
}
