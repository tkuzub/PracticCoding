package com.practic.codewars.list.node;

import java.util.List;

/**
 * For example: Given the list: 1 -> 2 -> 3 -> 3, and the value 3, indexOf / index_of should return 2.
 * <p>
 * The linked list is defined as follows:
 */

public class MyList2 {
    private Node head;
    private int size;

    static class Node {
        public Node next;
        public Object data;

        Node(Object data) {
            this.data = data;
        }
    }

    public int indexOf(Node head, Object value) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.data.equals(value)) {
                return count;
            }
            ++count;
            curr = curr.next;
        }
        return -1;
    }
}
