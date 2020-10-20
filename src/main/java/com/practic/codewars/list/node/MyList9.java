/*Convert a linked list to a string
Related Kata
Although this Kata is not part of an official Series, you may also want to try out Parse a linked list from a string if
you enjoyed this Kata.

Preloaded
Preloaded for you is a class, struct or derived data type Node (depending on the language) used to construct linked
lists in this Kata:*/

package com.practic.codewars.list.node;

public class MyList9 {

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

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

    }

    public String stringify(Node list) {
        Node curr = list;
        String result = "";

        while (curr != null) {
            result += String.valueOf(curr.getData());
            curr = curr.getNext();
        }
        return result;
    }
}
