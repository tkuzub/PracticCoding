package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyCounterTest {
    private MonkeyCounter monkeyCounter;

    @Before
    public void setUp() {
        monkeyCounter = new MonkeyCounter();
    }
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1,2,3,4,5},monkeyCounter.monkeyCount(5));
        assertArrayEquals(new int[]{1,2,3},monkeyCounter.monkeyCount(3));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},monkeyCounter.monkeyCount(9));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10},monkeyCounter.monkeyCount(10));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},monkeyCounter.monkeyCount(20));
    }
}