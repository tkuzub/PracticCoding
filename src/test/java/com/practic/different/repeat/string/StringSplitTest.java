package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringSplitTest {
    private StringSplitVarLoop stringSplit;

    @Before
    public void setUp() {
        stringSplit = new StringSplitVarLoop();
    }

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(stringSplit.solution(s)));
        assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(stringSplit.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(stringSplit.solution(s)));
        assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(stringSplit.solution(s1)));
    }
}