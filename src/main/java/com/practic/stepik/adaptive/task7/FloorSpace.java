/*Residents of the Malevia country often experiment with the plan of their rooms. Rooms can be triangular,
rectangular and round. To quickly calculate the floorage it is required to write a program, which gets the type of the
room shape and the relevant parameters as input - the program should output the area of the resulting room.

The value of 3.14 is used instead of the number π in Malevia.

Input format used by the Malevians:

triangle
a
b
c
where a, b and c — lengths of the triangle sides.

rectangle
a
b
where a and b —lengths of the rectangle sides.

circle
r
where r — circle radius.
Sample Input 1:

rectangle
4
10
Sample Output 1:

40.0
Sample Input 2:

circle
5
Sample Output 2:

78.5
Sample Input 3:

triangle
3
4
5
Sample Output 3:

6.0*/

package com.practic.stepik.adaptive.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FloorSpace {
    public static void main(String[] args) throws IOException {
        String line;
        double area;
        double a, b, c, r, p;

        List<Integer> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input figure");
        line = br.readLine();
        if (line.equals("triangle")) {
            System.out.println("input a");
            data.add(Integer.parseInt(br.readLine()));
            a = data.get(0);
            System.out.println("input b");
            data.add(Integer.parseInt(br.readLine()));
            b = data.get(1);
            System.out.println("input c");
            data.add(Integer.parseInt(br.readLine()));
            c = data.get(2);

            p = ((a + b + c) * 0.5);
            area = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
            System.out.println(area);


        } else if (line.equals("rectangle")) {
            System.out.println("input a");
            data.add(Integer.parseInt(br.readLine()));
            a = data.get(0);
            System.out.println("input b");
            data.add(Integer.parseInt(br.readLine()));
            b = data.get(1);

            area = a * b;
            System.out.println(area);
        } else {
            System.out.println("input r");
            data.add(Integer.parseInt(br.readLine()));
            r = data.get(0);
            area = 3.14 * r * r;
            System.out.println(area);
        }
    }
}
