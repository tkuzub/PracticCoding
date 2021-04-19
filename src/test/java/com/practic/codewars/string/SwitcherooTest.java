package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitcherooTest {
    private Switcheroo ref;

    @Before
    public void setUp()  {
        ref = new Switcheroo();
    }

    @Test
    public void testSomething() {
        assertEquals("abc",ref.switcheroo( "bac"));
        assertEquals("ccc",ref.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",ref.switcheroo("bbbacccabbb"));
    }
}