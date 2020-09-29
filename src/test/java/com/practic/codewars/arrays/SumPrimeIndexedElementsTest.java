package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumPrimeIndexedElementsTest {
    private SumPrimeIndexedElements elements;

    @Before
    public void setUp() {
        elements = new SumPrimeIndexedElements();
    }

    @Test
    public void basicTest() {
        assertEquals(0,elements.solve(new int [] {}));
        assertEquals(7,elements.solve(new int [] {1,2,3,4}));
        assertEquals(13,elements.solve(new int [] {1,2,3,4,5,6}));
        assertEquals(47,elements.solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }
}