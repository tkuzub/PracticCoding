package com.practic.codewars.list.node;

import java.util.function.BiFunction;

/**
 * Implement the method reduce, which accepts three arguments:
 *
 * linked list (head)
 * bi-function - (accumulated_value, current_element_data)
 * initial value
 * This method should return the result of applying the given function on every element with the accumulating result,
 * starting with the initial value.
 *
 * For example:
 *
 * Given the list: 1 -> 2 -> 3, the function (acc, curr) => acc + curr and an initial value of 0, reduce should
 * return 6, because:
 *
 * (0, 1) and the function (acc, curr) => acc + curr gives 1
 * (1, 2) and the function (acc, curr) => acc + curr gives 3
 * (3, 3) and the function (acc, curr) => acc + curr gives 6
 * Another example:
 *
 * Given the list: 1 -> 2 -> 3 -> 4, the function (acc, curr) => acc * curr and an initial value of 1,
 * reduce should return 24
 * @param <T>
 */

public class MyList8<T> {
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

    public static <T> T reduce(Node<T> head, BiFunction<T, T, T> f, T init) {
        Node<T> curr = head;
        while (curr != null) {
            init = f.apply(init, curr.data);
            curr = curr.next;
        }
        return init;
    }
}
