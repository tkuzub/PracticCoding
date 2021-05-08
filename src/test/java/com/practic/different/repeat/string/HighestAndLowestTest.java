package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighestAndLowestTest {
    private HighestAndLowest highestAndLowest;

    @Before
    public void setUp() {
        highestAndLowest = new HighestAndLowest();
    }

    @Test
    public void test1() {
        assertEquals("42 -9", highestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}