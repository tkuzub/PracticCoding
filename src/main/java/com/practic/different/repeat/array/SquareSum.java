package com.practic.different.repeat.array;

import java.util.stream.IntStream;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
public class SquareSum {
    public int squareSum(int[] n) {
        return IntStream.of(n).map(x -> x * x).sum();
    }
}
