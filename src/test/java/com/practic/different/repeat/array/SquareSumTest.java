package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareSumTest {
    private SquareSum squareSum;

    @Before
    public void setUp() {
        squareSum = new SquareSum();
    }

    @Test
    public void testBasic() {
        assertEquals(9, squareSum.squareSum(new int[] {1,2,2}));
        assertEquals(5, squareSum.squareSum(new int[] {1,2}));
        assertEquals(50, squareSum.squareSum(new int[] {5,-3,4}));
    }
}