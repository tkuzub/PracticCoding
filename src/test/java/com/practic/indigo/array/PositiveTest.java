package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveTest {
    private Positive positive;

    @Before
    public void setUp() {
        positive = new Positive();
    }

    @Test
    public void testSomething() {
        assertEquals(15, positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, positive.sum(new int[]{}));
        assertEquals(0, positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, positive.sum(new int[]{-1,2,3,4,-5}));
    }
}