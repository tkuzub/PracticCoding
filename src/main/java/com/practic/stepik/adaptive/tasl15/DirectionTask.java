package com.practic.stepik.adaptive.tasl15;

import java.util.Scanner;

/**
 * Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – stay) and outputs
 * the text «move up» (or «move down», or «move left», or «move right»,
 * or «do not move» depending on the entered number). If it is a number that does not belong to any of the
 * listed directions, the program should output: «error!»
 *
 * Note: the output text should exactly match the sample! Including letters case and location of spaces.
 */
public class DirectionTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] a = {"do not move", "move up", "move down", "move left", "move right"};

        try {
            System.out.println(a[scan.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error!");
        }
    }
}
