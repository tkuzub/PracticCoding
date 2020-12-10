package com.practic.codewars.arrays;

import java.util.stream.IntStream;

public class GetMeanArray {
    public int getAverage(int[] marks){
        return (int) IntStream.of(marks).average().orElse(0);
    }
}
