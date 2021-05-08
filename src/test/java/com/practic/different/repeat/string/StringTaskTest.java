package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTaskTest {
    private StringTask task;

    @Before
    public void setUp() {
        task = new StringTask();
    }

    @Test
    public void perform() {
        assertEquals( ".t.r", task.perform( "tour" ) );
        assertEquals( ".c.d.w.r.s", task.perform( "Codewars" ) );
        assertEquals( ".b.c.b", task.perform( "aBAcAba" ) );
    }
}