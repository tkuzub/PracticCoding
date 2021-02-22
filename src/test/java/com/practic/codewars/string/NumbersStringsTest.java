package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersStringsTest {
    private NumbersStrings numbersStrings;

    @Before
    public void setUp() {
        numbersStrings = new NumbersStrings();
    }

    @Test
    public void basicTests(){
        assertEquals(9,numbersStrings.solve("2ti9iei7qhr5"));
        assertEquals(695,numbersStrings.solve("gh12cdy695m1"));
        assertEquals(85,numbersStrings.solve("lu1j8qbbb85"));
        assertEquals(185,numbersStrings.solve("185lu1j8qbbb85"));
    }
}