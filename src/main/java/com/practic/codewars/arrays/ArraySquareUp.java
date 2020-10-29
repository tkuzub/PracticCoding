/*This is a question from codingbat

Given an integer n greater than or equal to 0, create and return an array with the following pattern:

squareUp(3) => [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) => [0, 1, 2, 1]
squareUp(4) => [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/

package com.practic.codewars.arrays;

import java.util.stream.IntStream;

public class ArraySquareUp {
    public int[] squareUp(int n) {
        return IntStream.range(0, n)
                .flatMap(x -> IntStream.range(0, n).map(y -> y >= n - 1 - x ? n - y : 0))
                .toArray();
    }
}
