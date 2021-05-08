package com.practic.different.codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
 with the value of all the strings starting with that character appended together in the order they appear in the array.

 firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 firstChar([]) → {}
 */

public class App04 {
    public static void main(String[] args) {
        assertMethod1();
        assertMethod2();
    }

    public static Map<String, String> word0(String[] strings) {
        String ch;
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            ch = str.substring(0, 1);
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + str);
            } else {
                result.put(ch, str);
            }
        }
        return result;
    }
    private static void assertMethod1() {
        Map<String, String> input1 = new HashMap<>();
        input1.put("s", "saltsoda");
        input1.put("t", "teatoast");
        verify(new String[]{"salt", "tea", "soda", "toast"}, input1);
    }

    private static void assertMethod2() {
        Map<String, String> input2 = new HashMap<>();
        input2.put("a", "aaaAA");
        input2.put("b", "bb");
        input2.put("c", "cccCC");
        input2.put("d", "d");
        verify(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}, input2);
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
