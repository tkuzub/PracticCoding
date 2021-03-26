package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FeastManyBeastsTest {
    private FeastManyBeasts feastManyBeasts;

    @Before
    public void setUp() {
        feastManyBeasts = new FeastManyBeasts();
    }

    @Test
    public void fixedTest() {
        assertTrue(feastManyBeasts.feast("great blue heron","garlic nann"));
        assertTrue(feastManyBeasts.feast("chickadee","chocolate cake"));
        assertFalse(feastManyBeasts.feast("brown bear","bear claw"));
    }
}