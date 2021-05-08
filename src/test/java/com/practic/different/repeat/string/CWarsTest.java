package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CWarsTest {
    private CWars wars;

    @Before
    public void setUp() {
        wars = new CWars();
    }

    @Test
    public void testExamples() {
        assertEquals("C.Wars", wars.initials("code wars"));
        assertEquals("B.H.Obama", wars.initials("Barack hussain obama"));
        assertEquals("B.H.Obama", wars.initials("barrack hussain Obama"));
    }
}