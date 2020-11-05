/*In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur
only twice. Your task will be to return the sum of the numbers that occur only once.

For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.
Every other number occurs twice.

More examples in the test cases.

If you like this Kata, please try:*/

package com.practic.codewars.algorithm;

public class SumArraySingles {
    public int repeats(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }

            if (arr[i] != -1) {
                sum += arr[i];
            }
        }
        return sum;
    }
}