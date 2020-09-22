package com.practic.codewars.list;
/*
Elements at indices 0, 2, 4 are 11, 13, 15 and they are at odd positions as 11 is at position #1,
13 is at position #3 and 15 at #5.

Elements at indices 1, 3 are 12 and 14 and they are at even position.
So we need to add 11, 13, 15 as they are and square of 12 and 14

--> 11 + 13 + 15 + 12^2 + 14^2
= 11 + 13 + 15 + 144 + 196
= 379
 */

public class AlternateSquareSum {
    public  int alternateSqSum(int[] arr) {
        int sum = 0;
        int data;

        for (int index = 0; index < arr.length; index++) {
            data = arr[index];
            sum += (index % 2 == 0) ? data : data * data;
        }
        return sum;
    }
}
