package com.practic.codewars.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
 *
 * the string should start with a 1.
 *
 * a string with size 6 should return :'101010'.
 *
 * with size 4 should return : '1010'.
 *
 * with size 12 should return : '101010101010'.
 *
 * The size will always be positive and will only use whole numbers.
 */
public class StringyStrings {
    public String stringy(int size) {
        String result = IntStream.range(0, size / 2).mapToObj(s -> "10").collect(Collectors.joining());
        if (size % 2 == 1) {
            return result + "1";
        }
        return result;
    }
}


/*IntStream.rangeClosed(1, size)
                    .map(i -> i % 2)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(""));*/