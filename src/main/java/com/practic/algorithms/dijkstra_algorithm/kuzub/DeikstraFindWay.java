package com.practic.algorithms.dijkstra_algorithm.kuzub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1. Найти узел с найменьшей стоимость
 * 2. Проверить есть ли более дешевле путь к узлам, если есть обновить существующие
 * 3. Повторять пока это не будет сделано для всех узлов
 * 4. Вычислить итоговый путь
 */
public class DeikstraFindWay {

    private static final Map<Integer, Map<Integer, Double>> graph = new HashMap<>();
    private static final List<String> processed = new ArrayList<>();

    public static void main(String[] args) {
        // 1 Node
        graph.put(1, new HashMap<>());
        graph.get(1).put(2, 10.0);
        graph.get(1).put(3, 6.0);
        graph.get(1).put(4, 8.0);

        // 2 Node
        graph.put(2, new HashMap<>());
        graph.get(2).put(4, 5.0);
        graph.get(2).put(7, 11.0);
        graph.get(2).put(5, 13.0);

        // 3 Node
        graph.put(3, new HashMap<>());
        graph.get(3).put(5, 3.0);

        // 4 Node
        graph.put(4, new HashMap<>());
        graph.get(4).put(7, 12.0);
        graph.get(4).put(6, 7.0);
        graph.get(4).put(5, 5.0);

        // 5 Node
        graph.put(5, new HashMap<>());
        graph.get(5).put(6, 9.0);
        graph.get(5).put(9, 12.0);

        // 6 Node
        graph.put(6, new HashMap<>());
        graph.get(6).put(8, 8.0);
        graph.get(6).put(9, 10.0);

        // 7 Node
        graph.put(7, new HashMap<>());
        graph.get(7).put(9, 16.0);
        graph.get(7).put(6, 4.0);
        graph.get(7).put(8, 6.0);

        // 8 Node
        graph.put(8, new HashMap<>());
        graph.get(8).put(9, 15.0);

        // 9 Node
        graph.put(9, new HashMap<>());

        // The costs table
        Map<Integer, Double> costs = new HashMap<>();
        costs.put(2, 10.0);
        costs.put(3, 6.0);
        costs.put(4, 8.0);
        costs.put(5, 3.0);
        costs.put(6, 8.0);
        costs.put(7, 12.0);
        costs.put(8, 15.0);
        costs.put(9, Double.POSITIVE_INFINITY);

        // The parents table
        Map<Integer, List<Integer>> parents = new HashMap<>();
        parents.put(2, List.of(1));
        parents.put(3, List.of(1));
        parents.put(4, List.of(1));
        parents.put(5, List.of(2, 3, 4));
        parents.put(6, List.of(4, 5, 7));
        parents.put(7, List.of(2, 4));
        parents.put(8, List.of(6, 7));
        parents.put(9, List.of(5, 6, 7, 8));
    }
}
