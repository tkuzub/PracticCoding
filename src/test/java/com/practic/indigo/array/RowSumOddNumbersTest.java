package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RowSumOddNumbersTest {
    private RowSumOddNumbers sumOddNumbers;

    @Before
    public void setUp() {
        sumOddNumbers = new RowSumOddNumbers();
    }

    @Test
    public void test1() {
        assertEquals(1, sumOddNumbers.rowSumOddNumbers(1));
        assertEquals(8, sumOddNumbers.rowSumOddNumbers(2));
        assertEquals(27, sumOddNumbers.rowSumOddNumbers(3));
        assertEquals(74088, sumOddNumbers.rowSumOddNumbers(42));
    }
}