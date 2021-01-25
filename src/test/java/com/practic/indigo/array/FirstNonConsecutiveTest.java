package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNonConsecutiveTest {
    private FirstNonConsecutive firstNonConsecutive;

    @Before
    public void setUp() {
        firstNonConsecutive = new FirstNonConsecutiveStream();
    }

    @Test
    public void basicTests() {
        assertEquals(Integer.valueOf(6), firstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertNull(firstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), firstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), firstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertNull(firstNonConsecutive.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), firstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), firstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    }
}