package com.practic.indigo.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    private Vowels vowels;

    @Before
    public void setUp() {
        vowels = new Vowels();
    }

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, vowels.getCount("abracadabra"));
    }

    @Test
    public void testCase2() {
        assertEquals("Nope", 5, vowels.getCount("abrecodubri"));
    }
}