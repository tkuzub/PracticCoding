package com.practic.codewars.algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumArraySinglesTest {
    private SumArraySingles arraySingles;

    @Before
    public void setUp() {
        arraySingles = new SumArraySingles();
    }

    @Test
    public void basicTests(){
        assertEquals(15,arraySingles.repeats(new int []{4,5,7,5,4,8}));
        assertEquals(19,arraySingles.repeats(new int []{9, 10, 19, 13, 19, 13}));
        assertEquals(12,arraySingles.repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11}));
    }
}