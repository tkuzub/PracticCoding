package com.practic.stepik.adaptive.task13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * When Anthony read "War and Peace", he wondered how many words and how much of them were used in this book.
 *
 * Help Anthony to write a simplified version of a program that can count the words, separated by a space and output the resulting statistics.
 *
 * The program must read one line from the standard input and for each unique word in this line output the count of its repeated occurrence (case insensitive) in the "word amount" format (see the output example).
 *
 * The order of words output may be arbitrary. Each unique word must appear in the output only once.
 */
public class WarPeace {
    public static void main(String[] args) {

        Arrays.stream(new Scanner(System.in).nextLine().split("[\\s+]")).map(String::toLowerCase).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                forEach((str, count) -> {
                    System.out.printf("%s %d\n", str, count);
                });
    }
}
