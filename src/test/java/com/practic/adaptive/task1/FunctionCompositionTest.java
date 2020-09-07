package com.practic.adaptive.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionCompositionTest {
    private FunctionComposition fun;

    @Before
    public void setup() {
        fun = new FunctionComposition();
    }

    @Test
    public void testUnaryOperation() {
        //when
        int result = fun.combinedOperator.applyAsInt(5);
        //then
        assertEquals(32, result);
    }
}
