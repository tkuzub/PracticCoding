package com.practic.codewars.functional.other;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class GetIteratorTest {
    private GetIterator iterator;

    @Before
    public void setUp() {
        iterator = new GetIterator();
    }

    @Test
    public void testDoubling() {
        Function<Integer, Integer> getDouble = x -> x*2;
        Function<Integer, Integer> custDouble = iterator.getIterator(getDouble, 1);
        assertEquals("getDouble", 4, (int)custDouble.apply(2));
        Function<Integer, Integer> getQuadruple = iterator.getIterator(getDouble, 2);
        assertEquals("getQuadruple", 8, (int)getQuadruple.apply(2));
    }
}