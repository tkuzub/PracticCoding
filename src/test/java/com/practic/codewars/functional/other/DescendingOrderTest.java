package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderTest {
    private DescendingOrder order;

    @Before
    public void setUp() {
        order = new DescendingOrder();
    }

    @Test
    public void test_01() {
        assertEquals(0, order.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, order.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, order.sortDesc(123456789));
    }
}