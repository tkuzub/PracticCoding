package com.practic.codewars.functional.other;

import java.util.stream.IntStream;

/**
 * Write a function dot(int[] a, int[] b) -> int that calculates the dot product a · b, which is equal to the sum
 * of the product of each respective element of a and b. For example,
 * [1, 2, 3] · [4, 5, 6] = 1(4) + 2(5) + 3(6) = 32.
 *
 * Your algorithm will be tested with vectors of up to 100 elements. Good luck!
 */

public class DotProduct {
    public int dot(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
