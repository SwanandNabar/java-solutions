package com.practice.GeeksForGeeks.Queue;

import java.util.*;

public class Deque {

    public static void main(String[] args) {

        java.util.Deque deque = new LinkedList();

        deque.add("Element 1 (Tail)");
        deque.addFirst("Element 2 (Head) ");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)");
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");

        System.out.println(deque + "\n");

        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // reverse print
        Iterator reverse = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(reverse.next());
        }

        // peek
        System.out.println("Peek " + deque.peek());

        // peekfirst
        System.out.println("Peek first " + deque.peekFirst());

        System.out.println("Peek Last " + deque.peekLast());

        System.out.println("Pop " + deque.pop());

        System.out.println("Poll " + deque.poll());
        System.out.println("Poll First " + deque.poll());
        System.out.println("Poll Last : " + deque.pollLast());

        System.out.println("Remove " + deque.remove());

        System.out.println("Remove first " + deque.removeFirst());

        System.out.println("Remove last " + deque.removeLast());

        deque.add(23);
        deque.add(23);
        deque.add(23);

        System.out.println("Remove first occurence  " + deque.removeFirstOccurrence(23));





    }
}
