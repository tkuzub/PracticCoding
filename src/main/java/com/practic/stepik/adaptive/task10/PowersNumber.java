package com.practic.stepik.adaptive.task10;

import java.util.Scanner;

/**
 * Given number N. Print all integer powers of two, not exceeding N, in ascending order.
 *
 * Sample Input:
 *
 * 50
 * Sample Output:
 *
 * 1
 * 2
 * 4
 * 8
 * 16
 * 32
 */
public class PowersNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double pow = Math.pow(2, i);
            if (pow <= n) {
                System.out.println((int)pow);
            }
        }
    }
}


/*canner scan = new Scanner(System.in);

        double n = scan.nextDouble();
        double k = Math.log(n)/Math.log(2);
        int s = (int)k;

        Stream.iterate(1, x->2*x).limit(++s).forEach(System.out::println);*/