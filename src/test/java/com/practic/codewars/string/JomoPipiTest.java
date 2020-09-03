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
        assertEquals("a0", jomoPipi.antiString("9Z"));
    }
    @Test
    public void Basic2() {
        assertEquals("aBc123", jomoPipi.antiString("678XyZ"));
    }
    @Test
    public void Basic3() {
        assertEquals("678bcdXYZ", jomoPipi.antiString("abcWXY123"));
    }
}
