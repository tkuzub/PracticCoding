/*Write a program that checks whether two given words are anagrams.

The program should output True in the case if entered words are anagrams, and False otherwise.

Input format:

Two words, each on a separate line. Words can only consist of Latin characters. Y
our solution should be case insensitive, i.e. characters' case should not affect the answer.

Sample Input 1:

silent
listen
Sample Output 1:

True
Sample Input 2:

AbaCa
AcaBa
Sample Output 2:

True
Sample Input 3:

abaca
acada
Sample Output 3:

False*/

package com.practic.stepik.adaptive.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.function.Supplier;

public class Anagram {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Supplier<int[]> f = () -> {
            try {
                return in.readLine().toLowerCase().chars().sorted().toArray();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        };

        System.out.println(Arrays.equals(f.get(), f.get()) ? "True" : "False");
    }
}
