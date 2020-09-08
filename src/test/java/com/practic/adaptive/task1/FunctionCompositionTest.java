package com.practic.adaptive.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionCompositionTest {

    @Test
    public void testUnaryOperation() {
        //given
        FunctionComposition fun = new FunctionComposition();
        //when
        int result = fun.combinedOperator.applyAsInt(5);
        //then
        assertEquals(32, result);
    }
}
