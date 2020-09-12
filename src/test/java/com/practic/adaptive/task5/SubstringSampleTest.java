package com.practic.adaptive.task5;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SubstringSampleTest {
    private SubstringSample sample;

    @Before
    public void setUp() {
        sample = new SubstringSample();
    }

    @Test
    public void testCaseOne() {
        assertMethod("[-1]", "abc", "d");
    }

    @Test
    public void testCaseTwo() {
        assertMethod("[0, 4, 8]", "abacabadaba", "aba");
    }

    @Test
    public void testCaseThree() {
        assertMethod("[0, 1, 2]", "aaaa", "aa");
    }

    private void assertMethod(String expected, String firstStr, String secondStr) {
        int[] result = sample.givenSubstringInString(firstStr, secondStr);
        assertEquals(expected, Arrays.toString(result));
    }
}