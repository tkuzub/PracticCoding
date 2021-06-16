package com.practic.different.repeat.list.node;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CircularList<T> {
    private Node<T> head;

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T t;

        public T getT() {
            return t;
        }
    }


    public CircularList(final T... elements) {
        List<T> list = Arrays.stream(elements).collect(Collectors.toList());
        int index = 0;

        
        while (index != (list.size() - 1)) {
            if (head == null) {
                head = new Node<>();
                head.t = list.get(index++);
                head.prev = head;
            }

            Node<T> curr = head;
            while (curr != null) {
                if (curr.next == null) {
                    curr.next = new Node<>();
                    curr.next.t = list.get(index++);
//                    curr.prev = curr;
                }
                curr = curr.next;
            }
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
