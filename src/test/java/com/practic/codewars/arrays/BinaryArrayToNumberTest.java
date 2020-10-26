package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryArrayToNumberTest {
    private BinaryArrayToNumber number;

    @Before
    public void setUp() {
        number = new BinaryArrayToNumber();
    }

    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, number.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, number.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, number.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, number.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }
}