package com.practic.codewars.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationNumber {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10).
                mapToObj(value -> {
                    String result = String.valueOf(num * value);
                    String form = value + " * " + num;
                    return form + " = " + result;
                }).
                collect(Collectors.joining("\n"));
    }
}
