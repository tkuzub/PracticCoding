package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {
    private OddOrEven oddOrEven;

    @Before
    public void setUp() {
        oddOrEven = new OddOrEven();
    }

    @Test
    public void exampleTestOne() {
        assertEquals("odd", oddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }

    @Test
    public void exampleTestTwo() {
        assertEquals("even", oddOrEven.oddOrEven(new int[] {2, 5, 34, 6, 1}));
    }
}