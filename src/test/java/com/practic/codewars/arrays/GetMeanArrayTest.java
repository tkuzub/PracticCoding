package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetMeanArrayTest {
    private GetMeanArray meanArray;

    @Before
    public void setUp() {
        meanArray = new GetMeanArray();
    }

    @Test
    public void simpleTest() {
        assertEquals(2,meanArray.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,meanArray.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,meanArray.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}