package com.practic.codewars.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WellIdeasTest {
    private WellIdeas wellIdeas;

    public void setUp() {
        wellIdeas = new WellIdeas();
    }

    @Test
    public void basicTests() {
        assertEquals("Fail!", wellIdeas.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", wellIdeas.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", wellIdeas.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}