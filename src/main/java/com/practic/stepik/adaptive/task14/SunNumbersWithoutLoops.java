package com.practic.stepik.adaptive.task14;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * Given the sequence of numbers, ending with number 0. Find the sum of all these numbers without using a loop.
 */
public class SunNumbersWithoutLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(LongStream.generate(in::nextLong).takeWhile(n -> n != 0).sum());
    }
}
