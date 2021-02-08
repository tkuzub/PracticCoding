/*A detector compares the size of parts produced by a machine with the reference standard.

If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as reject, and the detector prints the number -1.
If the part was made perfect, it is sent to the box with ready products, and the detector prints 0.

Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
The program should output numbers in a single line – the number of ready parts, the number of parts to be fixed, and the number of rejects.

Sample Input:

13
0
-1
1
-1
0
0
1
-1
-1
-1
-1
0
0
Sample Output:

5 2 6*/

package com.practic.stepik.adaptive.task8;

import java.util.Scanner;

public class PartsFactory {
    public static void main(String[] args) {
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        Scanner scanner = new Scanner(System.in);
        int countPart = scanner.nextInt();
        while (countPart != 0) {
           int part = scanner.nextInt();
            if (part > 0) {
                larger++;
            } else if (part < 0) {
                smaller++;
            } else {
                perfect++;
            }
            countPart--;
        }
        System.out.printf("%d %d %d", perfect, larger, smaller);
    }
}
