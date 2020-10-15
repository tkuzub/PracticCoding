package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import java.util.function.IntUnaryOperator;

import static org.junit.Assert.*;

public class FunctionalAdditionTest {
    private FunctionalAddition funAddition;

    @Before
    public void setUp() {
        funAddition = new FunctionalAddition();
    }

    @Test
    public void simpleAdd() {
        IntUnaryOperator add = funAddition.add(3);
        int expected = add.applyAsInt(5);
        assertEquals("Kata.add(3,5)", expected, 8);
    }
}