package com.practic.codewars.functional.other;

import java.util.function.IntUnaryOperator;

/**
 * Create a function add(n)/Add(n) which returns a function that always adds n to any number
 *
 * Note for Java: the return type and methods have not been provided to make it a bit more challenging.
 *
 * ...returnType addOne = Kata.add(1);
 * addOne.method(3) => 4
 */

public class FunctionalAddition {
    public IntUnaryOperator add(int n) {
        return num -> num + n;
    }
}
