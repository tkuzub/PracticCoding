package com.practic.stepik.adaptive.task12;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a program that reads a three digit number, calculates the new number by reversing its digits, and outputs
 * a new number.
 *
 * Sample Input:
 *
 * 682
 * Sample Output:
 *
 * 286
 */
public class NumberReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        List<Integer> list = IntStream.range(0, data.length()).
                map(x -> Integer.parseInt(data.substring(x, x + 1))).boxed().
                collect(Collectors.toList());
        Collections.reverse(list);

        String result = list.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(result);
    }
}
