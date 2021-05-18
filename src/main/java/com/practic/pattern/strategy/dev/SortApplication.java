package com.practic.pattern.strategy.dev;

import java.util.Arrays;

public class SortApplication {
    public static void main(String[] args) {

        StrategyClient strategyClient = new StrategyClient();
        strategyClient.setSortSelect(new BubbleSort());

        int[] data1 = {5, 1, 10, 48, 3, 0, 9};
        Arrays.stream(data1).forEach(value -> {
            System.out.print(value + ", ");
        });
        System.out.println();

        strategyClient.sortPerform(data1);

        System.out.println(Arrays.toString(data1));

        System.out.println();

        int[] data2 = {5, 1, 10, 48, 3, 0, 9};
        Arrays.stream(data2).forEach(value -> {
            System.out.print(value + ", ");
        });
        System.out.println();

        strategyClient.setSortSelect(new InsertionSort());
        strategyClient.sortPerform(data2);

        System.out.println(Arrays.toString(data2));
    }
}
