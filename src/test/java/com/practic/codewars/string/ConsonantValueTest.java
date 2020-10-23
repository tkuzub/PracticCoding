package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantValueTest {
    private ConsonantValue consonantValue;

    @Before
    public void setUp() {
        consonantValue = new ConsonantValue();
    }

    @Test
    public void basicTests() {
        assertEquals(26, consonantValue.solve("zodiac"));
        assertEquals(80, consonantValue.solve("chruschtschov"));
        assertEquals(38, consonantValue.solve("khrushchev"));
        assertEquals(57, consonantValue.solve("strength"));
        assertEquals(73, consonantValue.solve("catchphrase"));
        assertEquals(103, consonantValue.solve("twelfthstreet"));
        assertEquals(80, consonantValue.solve("mischtschenkoana"));
    }
}