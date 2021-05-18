package com.practic.pattern.strategy.dev;

public class BubbleSort implements SortSelect {

    @Override
    public void sort(int[] array) {
        for (int first = array.length - 1; first > 0 ; first--) {
            for (int second = 0; second < first; second++) {
                if (array[second] > array[second + 1]) {
                    int temp = array[second];
                    array[second] = array[second + 1];
                    array[second + 1] = temp;
                }
            }
        }
    }
}
