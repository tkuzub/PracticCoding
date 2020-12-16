package com.practic.codewars.functional.other;

import java.util.stream.IntStream;

public class CalculateAverage {
    public double find_average(int[] array){
        return IntStream.of(array).average().orElse(-1);
    }
}
