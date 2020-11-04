package com.practic.stepik.adaptive.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true
 * if that string appears 2 or more times in the array.
 *
 *
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class App02 {
    public static void main(String[] args) {
        assertMethod1();
        assertMethod2();
    }

    public static Map<String, Boolean> word0(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String str : strings) {
            if (!(result.containsKey(str))) {
                result.put(str, false);
            } else {
                result.put(str, true);
            }
        }
        return result;
    }

    private static void assertMethod1() {
        Map<String, Boolean> input1 = new HashMap<>();
        input1.put("a", true);
        input1.put("b", true);
        input1.put("c", false);
        verify(new String[]{"a", "b", "a", "c", "b"}, input1);
    }

    private static void assertMethod2() {
        Map<String, Boolean> input2 = new HashMap<>();
        input2.put("a", false);
        input2.put("b", false);
        input2.put("c", false);
        verify(new String[]{"c", "b", "a"}, input2);
    }

    private static void verify(String[] data, Map<String, Boolean> input) {
        Map<String, Boolean> expected = word0(data);
        if (input.equals(expected)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}

