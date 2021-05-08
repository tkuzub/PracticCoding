package com.practic.different.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, create and return a Map<String, String> as follows:
 * for each string add its first character as a key with its last character as the value.
 *
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */

public class App05 {
    public static void main(String[] args) {
        assertMethod1();
        assertMethod2();
    }

    public static Map<String, String> word0(String[] strings) {
        String firstIndex;
        String lastIndex;
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            lastIndex = str.substring(str.length() - 1);
            firstIndex = str.substring(0, 1);
            result.put(firstIndex, lastIndex);
        }
        return result;
    }
    private static void assertMethod1() {
        Map<String, String> input1 = new HashMap<>();
        input1.put("b", "g");
        input1.put("c", "e");
        verify(new String[]{"code", "bug"}, input1);
    }

    private static void assertMethod2() {
        Map<String, String> input2 = new HashMap<>();
        input2.put("g", "d");
        input2.put("m", "n");
        input2.put("n", "t");
        verify(new String[]{"man", "moon", "good", "night"}, input2);
    }

    private static void verify(String[] data, Map<String, String> input) {
        Map<String, String> expected = word0(data);
        if (input.equals(expected)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
