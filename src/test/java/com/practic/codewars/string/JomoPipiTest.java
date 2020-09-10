package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JomoPipiTest {
    private JomoPipi jomoPipi;

    @Before
    public void setup() {
        jomoPipi = new JomoPipi();
    }

    @Test
    public void Basic1() {
        assertEquals("0", jomoPipi.antiString("9"));
        assertEquals("1", jomoPipi.antiString("8"));
        assertEquals("4", jomoPipi.antiString("5"));
        assertEquals("5", jomoPipi.antiString("4"));
        assertEquals("0", jomoPipi.antiString("9"));
    }

    @Test
    public void Basic2() {
        assertEquals("a", jomoPipi.antiString("Z"));
        assertEquals("b", jomoPipi.antiString("Y"));
        assertEquals("Y", jomoPipi.antiString("b"));
        assertEquals("W", jomoPipi.antiString("d"));
    }

    @Test
    public void Basic3() {
        assertEquals("a0", jomoPipi.antiString("9Z"));
        assertEquals("aBc123", jomoPipi.antiString("678XyZ"));
        assertEquals("678bcdXYZ", jomoPipi.antiString("abcWXY123"));
    }
}
