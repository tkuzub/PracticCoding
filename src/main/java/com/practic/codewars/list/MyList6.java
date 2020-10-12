package com.practic.codewars.list;

import java.util.function.Predicate;

/**
 * Implement the method filter, which accepts a linked list (head) and a predicate function,
 * and returns a new linked list (head) which only contains the elements which apply to the given predicate.
 *
 * For example: Given the list: 1 -> 2 -> 3, and the predicate x => x >= 2, filter should return 2 -> 3,
 * since x >= 2 applies to both 2 and 3.
 * @param <T>
 */

public class MyList6<T> {
    private Node<T> head;

    static class Node<T> {
        public T data;
        public Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }

    public static <T> Node<T> filter(Node<T> head, Predicate<T> p) {
        Node<T> curr = head;
        Node<T> newNode = new Node<>(null);
        Node<T> temp = newNode;
        while (curr != null) {
            if (p.test(curr.data)) {
                temp.next = new Node<>(curr.data);
                temp = temp.next;
            }
            curr = curr.next;
        }
        return newNode.next;
    }
}
