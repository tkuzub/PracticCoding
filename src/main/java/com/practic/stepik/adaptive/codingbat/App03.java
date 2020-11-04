package com.practic.stepik.adaptive.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 and the value is that string's length.


 wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
 wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
 wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */

public class App03 {
    public static void main(String[] args) {
        assertMethod1();
        assertMethod2();
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }

    private static void assertMethod1() {
        Map<String, Integer> input1 = new HashMap<>();
        input1.put("bb", 2);
        input1.put("a", 1);
        verify(new String[]{"a", "bb", "a", "bb"}, input1);
    }

    private static void assertMethod2() {
        Map<String, Integer> input2 = new HashMap<>();
        input2.put("code", 4);
        input2.put("bug", 3);
        verify(new String[]{"code", "code", "code", "bug"}, input2);
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
