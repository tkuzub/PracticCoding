package com.practic.codewars.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDiffTest {
    private MaxDiff diff;

    @Before
    public void setUp()  {
        diff = new MaxDiff();
    }

    @Test
    public void testBasic() {
        assertEquals("only positives", 4, diff.maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, diff.maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, diff.maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, diff.maxDiff(new int[]{ 1000000 }));
        assertEquals("empty", 0, diff.maxDiff(new int[]{}));
    }
}