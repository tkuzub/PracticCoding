package com.practic.different.repeat.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertNumberTest {
    private ConvertNumber convertNumber;

    @Before
    public void setUp() {
        convertNumber = new ConvertNumber();
    }

    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, convertNumber.digitize(35231));
    }
}