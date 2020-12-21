package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class HowCableTest {
    private HowCable howCable;

    @Before
    public void setUp() {
        howCable = new HowCable();

    }

    @Test
    public void simpleTest() {
        assertEquals(4,  howCable.calculateLength("----"));
        assertEquals(6, howCable.calculateLength("-__-"));
        assertEquals(9, howCable.calculateLength("-_=_-"));
        assertEquals(4, howCable.calculateLength("(--)"));
        assertEquals(6, howCable.calculateLength("(-_)"));
        assertEquals(8, howCable.calculateLength("_(-_)"));
    }


    @Test
    public void harderTest(){
        assertEquals(15, howCable.calculateLength("_(-(_))="));
        assertEquals(33, howCable.calculateLength("_((=)((-))(_))="));
    }
}