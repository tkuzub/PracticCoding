package com.practic.codewars.list;

import java.util.function.Predicate;

/**
 * Implement the method countIf (count_if in PHP), which accepts a linked list (head) and a predicate function,
 * and returns the number of elements which apply to the given predicate.
 *
 * For example: Given the list: 1 -> 2 -> 3, and the predicate x => x >= 2, countIf / count_if should return 2,
 * since x >= 2 applies to both 2 and 3
 *
 */

public class MyList4<T> {
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

    public static <T> int countIf(Node<T> head, Predicate<T> p) {
        int count = 0;
        Node<T> curr = head;
        while (curr != null) {
            if (p.test(curr.data)) {
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}
