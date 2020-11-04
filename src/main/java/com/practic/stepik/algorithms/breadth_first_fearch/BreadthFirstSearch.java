package com.practic.stepik.algorithms.breadth_first_fearch;

import java.util.*;

public class BreadthFirstSearch {

    private static final Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {

        graph.put("you", Arrays.asList("bob", "mary", "jon"));
        graph.put("bob", List.of("taras", "andrey"));
        graph.put("mary", List.of("tanya", "vasya"));
        graph.put("jon", List.of("den"));
        graph.put("taras", Collections.emptyList());
        graph.put("andrey", Collections.emptyList());
        graph.put("tanya", Collections.emptyList());
        graph.put("vasya", Collections.emptyList());
        graph.put("den", Collections.emptyList());

        search("you");
    }

    private static void search(String name) {
        Queue<String> requiredQueue = new ArrayDeque<>(graph.get(name));
        List<String> searched = new LinkedList<>();

        while (!requiredQueue.isEmpty()) {
            String person = requiredQueue.poll();
            if (!searched.contains(person)) {
                if (seller(person)) {
                    System.out.println("We found mango seller ");
                    return;
                } else {
                    searched.add(person);
                    requiredQueue.addAll(graph.get(person));
                }
            }
        }
    }

    private static boolean seller(String person) {
        return person.startsWith("d");
    }
}
