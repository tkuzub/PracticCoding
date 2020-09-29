package com.practic.codewars.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlternateSquareSumTest {
    @Test
    public void testExample() {
        AlternateSquareSum squareSum = new AlternateSquareSum();
        assertEquals(379, squareSum.alternateSqSum(new int[] {11, 12, 13, 14, 15}));
    }
}