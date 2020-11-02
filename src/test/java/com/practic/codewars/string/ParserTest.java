package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    private Parser parser;

    @Before
    public void setUp()  {
        parser = new Parser();
    }

    @Test
    public void fixedTests() {
        assertEquals(1 , parser.parseInt("one"));
        assertEquals(20 , parser.parseInt("twenty"));
        assertEquals(246 , parser.parseInt("two hundred forty-six"));
    }
}