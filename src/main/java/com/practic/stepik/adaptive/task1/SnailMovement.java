/*Snail

Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down.
In which day the snail will reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not
exceed 100.

Sample Input 1:

10
3
2
Sample Output 1:

8*/

package com.practic.stepik.adaptive.task1;

import java.util.Scanner;

public class SnailMovement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int count = 0;
        int curr = 0;
        if (h > a && a > b && h > 0 && h <= 100 && a > 0 && a <= 100 && b >= 0 && b <= 100) {
            while (curr <= h) {
                curr += a;
                count++;
                if (curr >= h) {
                    break;
                } else {
                    curr -= b;
                }
            }
        }
        System.out.println(count);
    }
}
