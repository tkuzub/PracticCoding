package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumArrayTest {
    private SumArray sumArray;

    @Before
    public void setUp() {
        sumArray = new SumArray();
    }

    @Test
    public void testSum() {
        assertEquals(0, sumArray.sum(new double[]{}), 1e-4);
        assertEquals(-2.398, sumArray.sum(new double[]{-2.398}), 1e-4);
        assertEquals(6, sumArray.sum(new double[]{1, 2, 3}), 1e-4);
        assertEquals(6.6, sumArray.sum(new double[]{1.1, 2.2, 3.3}), 1e-4);
        assertEquals(9.2, sumArray.sum(new double[]{1, 5.2, 4, 0, -1}), 1e-4);
        assertEquals(320, sumArray.sum(new double[]{30, 89, 100, 101}), 1e-4);
    }
}