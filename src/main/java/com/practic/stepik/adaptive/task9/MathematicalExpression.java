/*Write a simple interpreter of the mathematical expression.

The input is a string with expression, consisting of two numbers, connected by a binary operator: a \texttt{ operator }
ba operator b, where instead of \texttt{operator}operator the following words can be used: plus, minus, multiply,
divide - for addition, subtraction, multiplication and integer division respectively.

Input format:
One line containing the expression in a form of a \texttt{ operator } ba operator b, 0 \le a,b\le10000≤a,b≤1000.
The operator can be the following: plus, minus, multiply, divide.

Output format:
The line, containing an integer -− - the result of calculations.

Sample Input 1:

45 plus 8
Sample Output 1:

53
Sample Input 2:

12 minus 42
Sample Output 2:

-30
Sample Input 3:

451 multiply 2
Sample Output 3:

902
Sample Input 4:

13 divide 3
Sample Output 4:

4*/

package com.practic.stepik.adaptive.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathematicalExpression {
    public static void main(String[] args) {
        int result = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String input = reader.readLine();
            String[] s = input.split(" ");
            int firstDigit = Integer.parseInt(s[0]);
            int secondDigit = Integer.parseInt(s[2]);

            switch (s[1]) {
                case "plus":
                    result = firstDigit + secondDigit;
                    break;
                case "minus":
                    result = firstDigit - secondDigit;
                    break;
                case "multiply":
                    result = firstDigit * secondDigit;
                    break;
                case "divide":
                    result = Math.floorDiv(firstDigit, secondDigit);
                    break;
                default:
                    result = 0;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}

/*Scanner scanner = new Scanner(System.in);

        Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
        operations.put("plus", (left, right) -> left + right);
        operations.put("minus", (left, right) -> left - right);
        operations.put("divide", Math::floorDiv);
        operations.put("multiply", (left, right) -> left * right);

        int left = scanner.nextInt();
        String operation = scanner.next();
        int right = scanner.nextInt();

        BiFunction<Integer, Integer, Integer> function = operations.get(operation);
        System.out.println(function.apply(left, right));*/

/*class Main {
    private static enum Op {
        minus {
            int exec(int a, int b) {
                return a - b;
            }
        },
        plus {
            int exec(int a, int b) {
                return a + b;
            }
        },
        divide {
            int exec(int a, int b) {
                return Math.floorDiv(a, b);
            }
        },
        multiply {
            int exec(int a, int b) {
                return a * b;
            }
        };

        abstract int exec(int a, int b);
    }


  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      String operator = scanner.next();
      int b = scanner.nextInt();

      Op op = Op.valueOf(operator);

      System.out.println(op.exec(a, b));

  }
}*/
