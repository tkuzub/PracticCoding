package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckThreeAndTwoTest {
    private CheckThreeAndTwo threeAndTwo;

    @Before
    public void setUp() {
        threeAndTwo = new CheckThreeAndTwo();
    }

    @Test
    public void testSomething() {
        assertEquals(true, threeAndTwo.checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, threeAndTwo.checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, threeAndTwo.checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }
}