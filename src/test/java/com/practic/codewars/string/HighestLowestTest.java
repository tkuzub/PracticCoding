package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighestLowestTest {
    private HighestLowest highestLowest;

    @Before
    public void setUp() {
        highestLowest = new HighestLowest();
    }

    @Test
    public void test1() {
        assertEquals("42 -9", highestLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}