/*Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or
non-integer. If the array does not contain any numbers then you should retu*/


package com.practic.codewars.arrays;

import java.util.stream.DoubleStream;

public class SumArray {
    public static double sum(double[] numbers) {
        return DoubleStream.of(numbers).sum();
    }
}
