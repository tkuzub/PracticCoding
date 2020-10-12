package com.practic.codewars.list;

import java.util.function.Predicate;

/**
 * Implement the methods anyMatch (any_match in PHP) & allMatch (all_match in PHP), which accepts a linked list (head)
 * and a predicate function, and returns true if any / all of the elements apply to the given predicate.
 *
 * For example:
 *
 * Given the list: 1 -> 2 -> 3, and the predicate x => x > 1, anyMatch / any_match should return true (both 2 & 3 are
 * valid for this predicate), and allMatch / all_match should return false (1 is not valid for this predicate)
 *
 */
public class MyList5<T> {
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

    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        Node<T> curr = head;
        while (curr != null) {
            if (p.test(curr.data)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        Node<T> curr = head;
        while (curr != null) {
            if (!(p.test(curr.data))) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
}
