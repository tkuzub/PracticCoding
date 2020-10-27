/*Given a number, return a string with dash'-'marks before and after each odd integer, but do not
begin or end the string with a dash mark.

Ex:

dashatize(274) -> '2-7-4'
dashatize(6815) -> '68-1-5'*/

package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashatizeTest {
    private Dashatize dashatize;

    @Before
    public void setUp() {
        dashatize = new Dashatize();
    }

    @Test
    public void testBasic() {
        assertEquals("1-4-7-0-1-7-4-1-9-1", dashatize.dashatize(1470174191));
        assertEquals("2-7-4", dashatize.dashatize(274));
        assertEquals("5-3-1-1", dashatize.dashatize(5311));
        assertEquals("86-3-20", dashatize.dashatize(86320));
        assertEquals("9-7-4-3-02", dashatize.dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", dashatize.dashatize(0));
        assertEquals("1", dashatize.dashatize(-1));
        assertEquals("28-3-6-9", dashatize.dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", dashatize.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", dashatize.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", dashatize.dashatize(-1111111111));
    }

}