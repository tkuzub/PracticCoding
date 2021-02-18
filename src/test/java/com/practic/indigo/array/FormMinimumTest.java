package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormMinimumTest {
    private FormMinimum min;

    @Before
    public void setUp() {
        min = new FormMinimum();
    }

    @Test
    public void testSomething() {
        assertEquals(13, min.minValue(new int[] {1,3,1}));
        assertEquals(457, min.minValue(new int[] {4, 7, 5, 7}));
        assertEquals(148, min.minValue(new int[] {4, 8, 1, 4}));
        assertEquals(579, min.minValue(new int[] {5, 7, 9, 5, 7}));
        assertEquals(678, min.minValue(new int[] {6, 7, 8, 7, 6, 6}));
    }
}