/*Linked Lists - Append

Write an Append() function which appends one linked list to another. The head of the resulting list should be returned.

var listA = 1 -> 2 -> 3 -> null
var listB = 4 -> 5 -> 6 -> null
append(listA, listB) === 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
If both listA and listB are null/NULL/None/nil, return null/NULL/None/nil. If one list is null/NULL/None/nil and the
other is not, simply return the non-null/NULL/None/nil list.*/

package com.practic.codewars.list.node;

public class MyList10 {

    private Node head;
    private int size;

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node append(Node listA, Node listB) {
            if (listA == null) {
                return listB;
            }

            if (listB == null) {
                return listA;
            }

            Node temp = listA;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = listB;
            return listA;
        }
    }
}
