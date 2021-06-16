package com.practic.different.repeat.list.tren;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(15);
        int result = myLinkedList.size();
        System.out.println(result);
        System.out.println(myLinkedList);

        myLinkedList.addFirst(100);
        System.out.println(myLinkedList);

        boolean cont = myLinkedList.contains(10);
        System.out.println(cont);

        Object getResult = myLinkedList.get(2);
        System.out.println(getResult);

        myLinkedList.remove(10);
        System.out.println(myLinkedList);

    }
}
