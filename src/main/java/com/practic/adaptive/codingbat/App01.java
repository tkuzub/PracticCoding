package com.practic.adaptive.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
 * different string, with the value the number of times that string appears in the array.
 *
 *
 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */

public class App01 {
    public static void main(String[] args) {
        assertMethod1();
        assertMethod2();
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        int count = 0;
        for(String str : strings) {
            result.put(str, result.getOrDefault(str, count) + 1);
        }
        return result;
    }

    private static void assertMethod1() {
        Map<String, Integer> input1 = new HashMap<>();
        input1.put("a", 2);
        input1.put("b", 2);
        input1.put("c", 1);
        verify(new String[]{"a", "b", "a", "c", "b"}, input1);
    }

    private static void assertMethod2() {
        Map<String, Integer> input2 = new HashMap<>();
        input2.put("a", 1);
        input2.put("b", 1);
        input2.put("c", 1);
        verify(new String[]{"c", "b", "a"}, input2);
    }

    private static void verify(String[] data, Map<String, Integer> input) {
        Map<String, Integer> expected = word0(data);
        if (input.equals(expected)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
