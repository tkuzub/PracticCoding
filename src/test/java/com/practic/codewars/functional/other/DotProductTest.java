package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DotProductTest {
    private DotProduct product;

    @Before
    public void setUp() {
        product = new DotProduct();
    }

    @Test
    public void test() {
        int expected = product.dot(new int[] {1, 2, 3}, new int[] {4, 5, 6});
        assertEquals(expected, 32);
    }
}