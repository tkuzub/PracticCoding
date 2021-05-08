package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedStringsTest {
    private ReversedStrings reversedStrings;

    @Before
    public void setUp() {
        reversedStrings = new ReversedStrings();
    }

    @Test
    public void sampleTests() {
        assertEquals("dlrow", reversedStrings.solution("world"));
    }
}