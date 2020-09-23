package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersInStringsTest {
    private NumbersInStrings numbers;

    @Before
    public void setUp() {
        numbers = new NumbersInStrings();
    }

    @Test
    public void basicTests() {
        assertEquals(9,numbers.solve("2ti9iei7qhr5"));
        assertEquals(695,numbers.solve("gh12cdy695m1"));
        assertEquals(85,numbers.solve("lu1j8qbbb85"));
        assertEquals(185,numbers.solve("185lu1j8qbbb85"));
    }
}