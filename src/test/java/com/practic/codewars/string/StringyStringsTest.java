package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StringyStringsTest {
    private StringyStrings strings;

    @Before
    public void setUp() {
        strings = new StringyStrings();
    }

    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', strings.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, strings.stringy(size).length());
        }
    }
}