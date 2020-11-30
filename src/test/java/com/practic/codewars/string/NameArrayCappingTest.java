package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class NameArrayCappingTest {
    private NameArrayCapping nameArrayCapping;

    @Before
    public void setUp() {
        nameArrayCapping = new NameArrayCapping();
    }

    @Test
    public void upcase() {
        String[] strings = new String[] {"jo", "nelson", "jurie"};
        assertEquals(new String[] {"Jo", "Nelson", "Jurie"}, nameArrayCapping.capMe(strings));
    }

    @Test
    public void downcase() {
        String[] strings = new String[] {"KARLY", "DANIEL", "KELSEY"};
        assertEquals(new String[] {"Karly", "Daniel", "Kelsey"}, nameArrayCapping.capMe(strings));
    }
}