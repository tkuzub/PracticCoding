package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CWarsTest {
    private CWars cWars;

    @Before
    public void setup() {
        cWars = new CWars();
    }

    @Test
    public void testExamples() {
        assertEquals("C.Wars", cWars.initials("code wars"));
        assertEquals("B.H.Obama", cWars.initials("Barack hussain obama"));
        assertEquals("B.H.Obama", cWars.initials("barrack hussain Obama"));
    }
}
