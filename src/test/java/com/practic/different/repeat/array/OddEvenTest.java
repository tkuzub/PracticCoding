package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    private OddEven oddEven;

    @Before
    public void setUp() {
        oddEven = new OddEven();
    }

    @Test
    public void exampleTest() {
        assertEquals("odd", oddEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}