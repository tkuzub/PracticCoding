package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void setUp() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", helloWorld.greet());
    }
}