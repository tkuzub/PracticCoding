package com.practic.codewars.list.node;

import java.util.List;

/**
 * Implement the method length, which accepts a linked list (head), and returns the length of the list.
 *
 * For example: Given the list: 1 -> 2 -> 3 -> 4, length should return 4.
 *
 * The linked list is defined as follows:
 */

public class MyList {
    private Node head;
    private int size;

    static class Node {
        public Node next;
        public Object data;

        Node(Object data) {
            this.data = data;
        }
    }

    public Node listFromArray(List<Integer> list) {
        int count = 0;
        if (head == null) {
            head = new Node(list.get(count++));
            size++;
        }
        Node curr = head;
        while (size != list.size()) {
            curr.next = new Node(list.get(count++));
            curr = curr.next;
            size++;
        }
        return head;
    }


    public int length(Node head) {
         Node curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
