package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTaskTest {
    private StringTask stringTask;

    @Before
    public void setUp() {
        stringTask = new StringTask();
    }

    @Test
    public void perform() {
        assertEquals( ".t.r", stringTask.perform( "tour" ) );
        assertEquals( ".c.d.w.r.s", stringTask.perform( "Codewars" ) );
        assertEquals( ".b.c.b", stringTask.perform( "aBAcAba" ) );

    }
}