package com.practic.codewars.functional.other;

/*
  Find the sum of the odd numbers within an array, after cubing the initial integers.
  The function should return undefined/None/nil/NULL if any of the values aren't numbers.
 */

import java.util.Arrays;

public class FindOddCubes {
    public int cubeOdd(int[] arr) {
        return (int) Arrays.stream(arr).
                filter(x -> x % 2 != 0).
                mapToDouble(n -> Math.pow(n, 3)).
                sum();
    }
}
