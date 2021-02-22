package com.practic.stepik.adaptive.task13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        Map<Integer, List<Integer>> collect = Arrays.stream(data.split(" ")).map(Integer::parseInt).
                collect(Collectors.groupingBy(Function.identity(), Collectors.toList()));

        String result = collect.entrySet().stream().
                filter(num -> num.getValue().size() > 1).
                map(key -> key.getKey() + " ").
                collect(Collectors.joining());

        System.out.println(result);
    }
}


/*class Main {

    public static void main(String[] args) {
        Arrays.stream((new Scanner(System.in)).nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((number, count) -> {
                    if (count > 1) {
                        System.out.print(number + " ");
                    }
                });
    }
}*/