package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoSpaceTest {
    private NoSpace ref;

    @Before
    public void setUp() {
        ref = new NoSpace();
    }

    @Test
    public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", ref.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", ref.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", ref.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", ref.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", ref.noSpace("8j aam"));
    }
}