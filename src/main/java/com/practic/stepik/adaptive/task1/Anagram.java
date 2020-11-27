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

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] one = in.nextLine().toLowerCase().split("");
        String[] two = in.nextLine().toLowerCase().split("");
        Arrays.sort(one);
        Arrays.sort(two);

        boolean result = Arrays.equals(one, two);
        System.out.println(result ? "True" : "False");
    }
}
