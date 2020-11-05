package com.practic.codewars.algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayingWithDigitsTest {
    private PlayingWithDigits playingWithDigits;

    @Before
    public void setUp() {
        playingWithDigits = new PlayingWithDigits();
    }

    @Test
    public void Test1() {
        assertEquals(1, playingWithDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, playingWithDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, playingWithDigits.digPow(46288, 3));
    }
}