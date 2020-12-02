package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLongerTest {
    private ReverseLonger reverseLonger;

    @Before
    public void setUp() {
        reverseLonger = new ReverseLonger();
    }

    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde",reverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau",reverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi",reverseLonger .shorterReverseLonger("abcde", "fghi"));
    }
}