package com.practic.codewars.data;

import java.util.stream.IntStream;

public class GrassHopper {
    public int findAverage(int[] nums) {
        return (int) IntStream.of(nums).average().orElse(-1);
    }
}
