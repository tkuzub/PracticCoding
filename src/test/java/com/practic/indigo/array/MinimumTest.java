package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumTest {
    private Minimum minimum;

    @Before
    public void setUp() {
        minimum = new Minimum();
    }

    @Test
    public void testSomething() {
        assertEquals(13, minimum.minValue(new int[] {1,3,1}));
        assertEquals(457, minimum.minValue(new int[] {4, 7, 5, 7}));
        assertEquals(148, minimum.minValue(new int[] {4, 8, 1, 4}));
        assertEquals(579, minimum.minValue(new int[] {5, 7, 9, 5, 7}));
        assertEquals(678, minimum.minValue(new int[] {6, 7, 8, 7, 6, 6}));
    }
}