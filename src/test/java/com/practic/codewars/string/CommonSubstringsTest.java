package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSubstringsTest {
    private CommonSubstrings comSubstring;

    @Before
    public void setUp() {
        comSubstring = new CommonSubstrings();
    }

    @Test
    public void ShouldBeTrue() {
        assertTrue(comSubstring.SubstringTest("Something","Home"));
    }

    @Test
    public void ShouldBeFalse() {
        assertFalse(comSubstring.SubstringTest("Something","Fun"));
    }
}