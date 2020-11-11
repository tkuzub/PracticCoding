package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreakCamelCaseTest {
    private BreakCamelCase camelCase;

    @Before
    public void setUp() {
        camelCase = new BreakCamelCase();
    }

    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", camelCase.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", camelCase.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", camelCase.camelCase("camelcasingtest"));
    }
}