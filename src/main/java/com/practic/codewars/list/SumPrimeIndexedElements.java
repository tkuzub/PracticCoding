package com.practic.codewars.list;

import java.util.stream.LongStream;

/**
 * In this Kata, you will be given an integer array and your task is to return the sum of elements occupying
 * prime-numbered indices.
 *
 * The first element of the array is at index 0.
 */
public class SumPrimeIndexedElements {

        public int solve(int [] arr){

        boolean flag;
        int sum = 0;
        for (int index = 2; index < arr.length; index++) {
            flag = primeIndex(index);
            if (flag) {
                sum += arr[index];
            }
        }
        return sum;
    }

    private boolean primeIndex(int index) {
        return  LongStream.rangeClosed(2, index / 2).noneMatch(prime -> index % prime == 0);
    }
}
