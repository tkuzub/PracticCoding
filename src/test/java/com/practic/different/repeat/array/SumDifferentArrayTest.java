package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDifferentArrayTest {
    private SumDifferentArray sumArray;

    @Before
    public void setUp() {
        sumArray = new SumDifferentArray();
    }

    @Test
    public void basicTests() {
        assertEquals(9, sumArray.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, sumArray.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, sumArray.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, sumArray.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, sumArray.sumOfDifferences(new int[0]));
        assertEquals(0, sumArray.sumOfDifferences(new int[]{0}));
        assertEquals(0, sumArray.sumOfDifferences(new int[]{-1}));
        assertEquals(0, sumArray.sumOfDifferences(new int[]{1}));
    }
}