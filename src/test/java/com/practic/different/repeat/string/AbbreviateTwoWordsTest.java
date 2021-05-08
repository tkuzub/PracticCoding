package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbbreviateTwoWordsTest {
    private AbbreviateTwoWords twoWords;

    @Before
    public void setUp() {
        twoWords = new AbbreviateTwoWords();
    }

    @Test
    public void testFixed() {
        assertEquals("S.H", twoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", twoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", twoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", twoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", twoWords.abbrevName("David Mendieta"));
    }
}