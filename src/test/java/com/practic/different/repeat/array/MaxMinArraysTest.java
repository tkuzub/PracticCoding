package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinArraysTest {
    private MaxMinArrays maxMin;

    @Before
    public void setUp() {
        maxMin = new MaxMinArrays();
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{15, 7, 12, 10, 11}, maxMin.solve(new int[]{15, 11, 10, 7, 12}));
        assertArrayEquals(new int[]{15, 7, 12, 10, 11}, maxMin.solve(new int[]{15, 11, 10, 7, 12}));
        assertArrayEquals(new int[]{15, 7, 12, 10, 11}, maxMin.solve(new int[]{15, 11, 10, 7, 12}));
    }
}