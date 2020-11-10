package com.practic.codewars.string;

import java.util.List;

public class AllLnclusive {
    public boolean containAllRots(String string, List<String> arr) {
        if (string.isEmpty()) {
            return true;
        }

        int[] data = arr.stream().mapToInt(value -> value.chars().sum()).toArray();

        int sum = string.chars().sum();

        int count = 0;
        for (int datum : data) {
            if (datum == sum) {
                count++;
            }
        }
        return count == string.length();
    }
}
