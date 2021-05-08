package com.practic.different.repeat.function;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderTest {
    private DescendingOrder descendingOrder;

    @Before
    public void setUp() {
        descendingOrder = new DescendingOrder();
    }

    @Test
    public void test_01() {
        assertEquals(0, descendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, descendingOrder.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, descendingOrder.sortDesc(123456789));
    }
}