package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOddCubesTest {
    private FindOddCubes oddCubes;

    @Before
    public void setUp() {
        oddCubes = new FindOddCubes();
    }

    @Test
    public void testSomething() {
        assertEquals(0, oddCubes.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, oddCubes.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, oddCubes.cubeOdd(new int[] {-3, -2, 2, 3}));
    }
}