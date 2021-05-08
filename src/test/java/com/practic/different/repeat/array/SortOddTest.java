package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortOddTest {
    private SortOdd sortOdd;

    @Before
    public void setUp() {
        sortOdd = new SortOdd();
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, sortOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, sortOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, sortOdd.sortArray(new int[]{}));
    }
}