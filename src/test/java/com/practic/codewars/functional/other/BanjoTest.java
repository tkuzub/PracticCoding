package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BanjoTest {
    private Banjo banjo;

    @Before
    public void setUp() {
        banjo = new Banjo();
    }

    @Test
    public void peopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", banjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", banjo.areYouPlayingBanjo("Rikke"));
    }
}