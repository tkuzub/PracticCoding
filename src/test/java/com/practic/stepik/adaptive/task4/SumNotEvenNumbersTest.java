package com.practic.stepik.adaptive.task4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumNotEvenNumbersTest {
    private SumNotEvenNumbers ref;

    @Before
    public void setup() {
        ref = new SumNotEvenNumbers();
    }

    @Test
    public void Solution1() {
        assertEquals(0, ref.sumOfOddNumbersInRange(0, 0));
    }

    @Test
    public void Solution2() {
        assertEquals(16, ref.sumOfOddNumbersInRange(7, 9));
    }

    @Test
    public void Solution3() {
        assertEquals(125, ref.sumOfOddNumbersInRange(21, 30));
    }
}
