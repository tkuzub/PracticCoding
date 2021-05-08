package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetWarTest {
    private AlphabetWar alphabetWar;

    @Before
    public void setUp() {
        alphabetWar = new AlphabetWar();
    }

    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", alphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", alphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", alphabetWar.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", alphabetWar.alphabetWar("wwwwwwz"));
    }
}