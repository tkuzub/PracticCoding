package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimizeSumOfArrayTest {
    private MinimizeSumOfArray sum;

    @Before
    public void setUp() {
        sum = new MinimizeSumOfArray2();
    }

    @Test
    public void basicTests() {
        assertEquals( 22, sum.minSum(new int[]{5,4,2,3}));
        assertEquals(342, sum.minSum(new int[]{12,6,10,26,3,24}));
        assertEquals( 74, sum.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }
}