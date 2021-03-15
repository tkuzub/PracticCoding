package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShifterTest {

    private Shifter shifter;
    @Before
    public void setUp() {
        shifter = new Shifter();
    }

    @Test
    public void on(){
        assertEquals(1, shifter.count("ON"));
    }
    @Test
    public void osIsUpdated(){
        assertEquals(2, shifter.count("OS IS UPDATED"));
    }
    @Test
    public void whoIsWho(){
        assertEquals(2, shifter.count("WHO IS WHO"));
    }
    @Test
    public void js(){
        assertEquals(0, shifter.count("JS"));
    }
    @Test
    public void iIiiIIii(){
        assertEquals(2, shifter.count("I III I III"));
    }
    @Test
    public void empty(){
        assertEquals(0, shifter.count(""));
    }
}