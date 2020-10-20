package com.practic.codewars.list.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhichAreInTest {
    private WhichAreIn areIn;

    @Before
    public void setUp()  {
        areIn = new WhichAreIn();
    }

    @Test
    public void test1() {
        String[] a = new String[]{ "arp", "live", "strong" };
        String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] r = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, areIn.inArray(a, b));
    }

    @Test
    public void test2() {
        String[] a = new String[]{"tarp", "mice", "bull"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[]{};
        assertArrayEquals(r, areIn.inArray(a, b));
    }
}