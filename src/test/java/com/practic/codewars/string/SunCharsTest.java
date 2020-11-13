package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SunCharsTest {
    private SunChars sunChars;

    @Before
    public void setUp() {
        sunChars = new SunChars();
    }

    @Test
    public void BasicTests() {
        assertTrue(sunChars.compare("AD", "BC"));
        assertFalse(sunChars.compare("AD", "DD"));
        assertTrue(sunChars.compare("gf", "FG"));
        assertTrue(sunChars.compare("zz1", ""));
        assertTrue(sunChars.compare("ZzZz", "ffPFF"));
    }
}