/*In the Roman numbering system, the following symbols are used to represent numbers (on the right are the numbers, which correspond to these symbols in the decimal system):

I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

We use an option in which the numbers 4, 9, 40, 90, 400 and 900 are represented by a subtraction of a smaller number from a larger one: IV, IX, XL, XC, CD and CM, respectively.

Write a program that converts the number from Roman system into the decimal one.

Input format:
The string, containing the number, encoded into the Roman numbering system. It is guaranteed that this number is less
than 4000.

Output format:
The string, containing the number in the decimal numbering system, which corresponds to the input.

Sample Input 1:

MCMLXXXIV
Sample Output 1:

1984
Sample Input 2:

IX
Sample Output 2:

9
Sample Input 3:

III
Sample Output 3:

3*/

package com.practic.stepik.adaptive.task6;

import java.util.Scanner;

public class RomanIntoDecimal {
    public static void main(String[] args) {
        String in;
        char ch;
        int romanSum = 0;

        Scanner scanner = new Scanner(System.in);
        in = scanner.nextLine();

        for (int index = 0; index < in.length(); index++) {
            ch = in.charAt(index);
            switch (ch) {
                case 'M':
                    romanSum += 1000;
                    break;
                case 'D':
                    romanSum += 500;
                    break;
                case 'C':
                    romanSum += 100;
                    break;
                case 'L':
                    romanSum += 50;
                    break;
                case 'X':
                    romanSum += 10;
                    break;
                case 'V':
                    romanSum += 5;
                    break;
                case 'I':
                    romanSum += 1;
                    break;
            }
        }
            if (in.contains("IV")) {
                romanSum -= 2;
            }
            if (in.contains("IX")) {
                romanSum -= 2;
            }
            if (in.contains("XL")) {
                romanSum -= 20;
            }
            if (in.contains("XC")) {
                romanSum -= 20;
            }
            if (in.contains("CD")) {
                romanSum -= 200;
            }
            if (in.contains("CM")) {
                romanSum -= 200;

        }
        System.out.println(romanSum);
    }
}
