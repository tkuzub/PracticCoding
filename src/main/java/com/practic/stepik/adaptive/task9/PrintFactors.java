package com.practic.stepik.adaptive.task9;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int index = 2; index <= number; index++) {
            while (number % index == 0) {
                number = number / index;
                System.out.print(index + " ");
            }
        }
    }
}
