package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {
    private Troll ref;

    @Before
    public void setUp() {
        ref = new Troll();
    }

    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",ref.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", ref.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", ref.disemvowel("What are you, a communist?"));
    }
}