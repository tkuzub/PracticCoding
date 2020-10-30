package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashatizeItTest {
    private DashatizeIt dashatizeIt;

    @Before
    public void setUp() {
        dashatizeIt = new DashatizeIt();
    }

    @Test
    public void testBasic() {
        assertEquals("2-7-4", dashatizeIt.dashatize(274));
        assertEquals("5-3-1-1", dashatizeIt.dashatize(5311));
        assertEquals("86-3-20", dashatizeIt.dashatize(86320));
        assertEquals("9-7-4-3-02", dashatizeIt.dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", dashatizeIt.dashatize(0));
        assertEquals("1", dashatizeIt.dashatize(-1));
        assertEquals("28-3-6-9", dashatizeIt.dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", dashatizeIt.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", dashatizeIt.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", dashatizeIt.dashatize(-1111111111));
    }
}