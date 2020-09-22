package com.practic.codewars.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSumTest {
    private MinimumSum sum;

    @Before
    public void setUp() {
        sum = new MinimumSum();
    }

    @Test
    public void testErrorNotEvenSize() {
        try {
            sum.minSum(new int[1]);
            fail("Expected RuntimeException");
        } catch (Exception e) {
            assertEquals("invalid length expects an even size of the array," +
                    " and you entered 1", e.getMessage());
        }
    }

    @Test
    public void basicTest() {
        assertEquals( 22, sum.minSum(new int[]{5,4,2,3}));
        assertEquals(342, sum.minSum(new int[]{12,6,10,26,3,24}));
        assertEquals( 74, sum.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }
}