package com.practic.codewars.list;

/**
 Implement the method lastIndexOf (last_index_of in PHP), which accepts a linked list (head) and a value,
 and returns the index (zero based) of the last occurrence of that value if exists, or -1 otherwise.

 For example: Given the list: 1 -> 2 -> 3 -> 3, and the value 3, lastIndexOf / last_index_of should return 3.
 */

public class MyList3 {
    private Node head;

    static class Node {
        public Node next;
        public Object data;

        Node(Object data) {
            this.data = data;
        }
    }

    public static int lastIndexOf(Node head, Object value) {
        Node curr = head;
        int count = 0;
        int lastIndex = -1;
        while (curr != null) {
            if (curr.data.equals(value)) {
                lastIndex = count;
            }
            ++count;
            curr = curr.next;
        }
        return lastIndex;
    }
}
