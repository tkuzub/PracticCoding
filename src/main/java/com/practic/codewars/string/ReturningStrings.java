package com.practic.codewars.string;

/**
 * Make a function that will return a greeting statement that uses an input; your program should return,
 * "Hello, <name> how are you doing today?".
 *
 * [Make sure you type the exact thing I wrote or the program may not execute properly]
 */
public class ReturningStrings {
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
}
