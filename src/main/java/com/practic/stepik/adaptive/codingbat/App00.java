package com.practic.stepik.adaptive.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * always with the value 0. For example the string "hello" makes the pair "hello":0.
 * We'll do more complicated counting later, but for this problem the value is simply 0.
 *
 *
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
 * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
 * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 */

public class App00 {
    public static void main(String[] args) {
        assertMethod1();
        assertMethod2();
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for(String str : strings) {
            result.put(str, 0);
        }
        return result;
    }

    private static void assertMethod1() {
        Map<String, Integer> input2 = new HashMap<>();
        input2.put("c", 0);
        input2.put("b", 0);
        input2.put("a", 0);
        verify(new String[]{"c", "b", "a"}, input2);
    }

    private static void assertMethod2() {
        Map<String, Integer> input1 = new HashMap<>();
        input1.put("a", 0);
        input1.put("b", 0);
        verify(new String[]{"a", "b", "a", "b"}, input1);
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
