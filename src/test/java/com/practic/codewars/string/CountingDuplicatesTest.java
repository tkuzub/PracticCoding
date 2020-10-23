package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingDuplicatesTest {
    private CountingDuplicates countDuplicates;

    @Before
    public void setUp() {
        countDuplicates = new CountingDuplicates();
    }

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, countDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, countDuplicates.duplicateCount("Abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, countDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, countDuplicates.duplicateCount(test));
    }
}