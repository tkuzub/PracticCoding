package com.practic.different.repeat.list.node;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CircularList<T> {
    private Node<T> head;

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T t;


    }


    public CircularList(final T... elements) {
        int index = 0;
        head = new Node<>();
        head.t = elements[index++];

        Node<T> curr = head;

        for (int i = index; i < elements.length; i++) {
            curr.next = new Node<>();
            curr.next.t = elements[i];
            curr = curr.next;
        }
    }

    T next() {
        Node<T> curr = head;
        return curr.t;
    }

    T prev() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        CircularList<String> xs = new CircularList<>("one", "two", "three");
        System.out.println(xs.next());
        System.out.println(xs.next());
        System.out.println(xs.next());
        System.out.println(xs.prev());
    }

}
