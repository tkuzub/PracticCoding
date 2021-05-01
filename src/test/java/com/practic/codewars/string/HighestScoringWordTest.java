package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighestScoringWordTest {
    private HighestScoringWord ref;

    @Before
    public void setUp() {
        ref = new HighestScoringWord();
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", ref.high("man i need a taxi up to ubud"));
        assertEquals("volcano", ref.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", ref.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", ref.high("aa b"));
        assertEquals("b", ref.high("b aa"));
        assertEquals("bb", ref.high("bb d"));
        assertEquals("d", ref.high("d bb"));
        assertEquals("aaa", ref.high("aaa b"));
    }
}