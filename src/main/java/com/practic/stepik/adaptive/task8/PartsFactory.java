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


/* try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Map<Integer, Long> map = Stream.generate(sc::nextInt).limit(n)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.printf("%d %d %d", map.get(0), map.get(1), map.get(-1));
        }*/



/*public final class Main {
    public static void main(String[] args) {
        try (final Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            final int size = input.nextInt();

            final Answer answer = new Answer();
            for (int i = 0; i < size; ++i) {
                final int partId = input.nextInt();
                answer.evaluate(partId);
            }
            answer.printResults();
        }
    }

    static final class Answer {

        private static final int NUMBER_OF_PARTS = 3;

        private final Part[] parts = new Part[NUMBER_OF_PARTS];

        public Answer() {
            parts[0] = new PerfectPart();
            parts[1] = new LargePart();
            parts[2] = new SmallPart();
        }

        public final void evaluate(int number) {
            for (final Part part : parts) {
                part.evaluate(number);
            }
        }

        public final void printResults() {
            System.out.format("%d %d %d%n", parts[0].counter, parts[1].counter, parts[2].counter);
        }
    }

    static abstract class Part {

        protected final int id;
        protected int counter;

        public Part(int id) {
            this.id = id;
        }

        public final void evaluate(int number) {
            if (number == id) {
                ++counter;
            }
        }
    }

    final static class SmallPart extends Part {

        public SmallPart() {
            super(-1);
        }
    }

    final static class LargePart extends Part {

        public LargePart() {
            super(1);
        }
    }

    final static class PerfectPart extends Part {

        public PerfectPart() {
            super(0);
        }
    }
}*/