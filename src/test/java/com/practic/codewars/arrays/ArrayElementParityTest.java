package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayElementParityTest {
    private ArrayElementParity elementParity;

    @Before
    public void setUp() {
        elementParity = new ArrayElementParity();
    }

    @Test
    public void basicTests() {
        assertEquals(3,elementParity.solve(new int [] {1,-1,2,-2,3}));
        assertEquals(-4,elementParity.solve(new int [] {-3,1,2,3,-1,-4,-2}));
        assertEquals(3,elementParity.solve(new int [] {1,-1,2,-2,3,3}));
        assertEquals(-38,elementParity.solve(new int [] {-110,110,-38,-38,-62,62,-38,-38,-38}));
        assertEquals(-9,elementParity.solve(new int [] {-9,-105,-9,-9,-9,-9,105}));
    }
}