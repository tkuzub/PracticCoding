package com.practic.stepik.adaptive.task11;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * The average value
 *
 * Given the sequence of integers, ending with number 0. Find the average value of all elements in this sequence.
 *
 * The number 0 itself is not included into the sequence and serves just as a sign of cessation.
 *
 * Sample Input:
 *
 * 1
 * 7
 * 9
 * 0
 * Sample Output:
 *
 * 5.66666666667
 */
public class IntegerSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = IntStream.generate(scanner::nextInt).takeWhile(n -> n != 0).average().orElse(0.0);
        System.out.println(v);
    }
}
