package com.practic.stepik.adaptive.task15;

import java.util.Scanner;

/**
 * GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all
 * guanines and cytosines to the overall number of nucleic bases in the genome sequence.
 * Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the
 * entered string. Your program should be case independent.
 *
 * For example, in the string "acggtgttat" the percentage of characters G and C equals to \dfrac4{10} \cdot 100 = 40.0
 * 10
 * 4
 * ​
 *  ⋅100=40.0, where 4 is the number of symbols G and C, and 10 is the length of the string.
 *
 * Output your result as a double value.
 */
public class PercentageCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] chars = scanner.nextLine().toLowerCase().toCharArray();
        int count = 0;

        for (Character ch : chars) {
            if (ch == 'g' || ch == 'c') {
                count++;
            }
        }

        System.out.println((double) count / chars.length * 100);
    }
}
