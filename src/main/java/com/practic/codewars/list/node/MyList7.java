package com.practic.codewars.list.node;

import java.util.function.Function;

/**
 * Implement the method map, which accepts a linked list (head) and a mapping function, and returns a new linked list
 * (head) where every element is the result of applying the given mapping method to each element of the original list.
 *
 * For example: Given the list: 1 -> 2 -> 3, and the mapping function x => x * 2, map should return 2 -> 4 -> 6
 * @param <T>
 */

public class MyList7<T> {
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

    public static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
        Node<T> curr = head;
        Node<R> newNode = new Node<>(null);
        Node<R> temp = newNode;

        while (curr != null) {
            temp.next = new Node<>(f.apply(curr.data));
            temp = temp.next;
            curr = curr.next;
        }
        return newNode.next;
    }
}
