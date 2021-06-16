package com.practic.different.repeat.list.tren;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    private Node head;
    private int size;

    public void addFirst(Object e) {
        Node newElement = new Node();
        newElement.value = e;
        newElement.next = head;
        head = newElement;
    }

    public boolean contains(Object e) {
        Node curr = head;
        while (curr != null) {
            if (curr.value.equals(e)) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public Object get(int index) {
        int currentIndex = 0;
        Node curr = head;
        while (curr != null) {
            if (currentIndex == index) {
                return curr.value;
            }
            curr = curr.next;
            currentIndex++;
        }
        return null;
    }

    public void remove(Object object) {
        Node curr = head;
        while (curr != null) {
            if (curr.next.value.equals(object)) {
                size--;
                curr = curr.next.next;
            }
            curr = curr.next;
        }
    }

    private static class Node {
        private Node next;
        private Object value;
    }

    public void add(Object e) {
        if (head == null) {
            head = new Node();
            head.value = e;
            size++;
            return;
        }

        Node curr = head;

        while (curr != null) {
            if (curr.next == null) {
                curr.next = new Node();
                curr.next.value = e;
                size++;
                return;
            }
            curr = curr.next;
        }
    }

    public int size() {
        return size;
    }

    public String toString() {
        List<Object> list = new LinkedList<>();

        Node curr = head;
        while (curr != null) {
            list.add(curr.value);
            curr = curr.next;
        }
        return list.toString();
    }
}
