package com.practic.indigo.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertCamelCaseTest {
    private ConvertCamelCase convertCamelCase;

    @Before
    public void setUp() {
        convertCamelCase = new ConvertCamelCase();
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("thestealthwarrior", convertCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("thestealthwarrior", convertCamelCase.toCamelCase(input));
    }
}