package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AllLnclusiveTest {
    private AllLnclusive allLnclusive;

    @Before
    public void setUp() {
        allLnclusive = new AllLnclusive();
    }

    private static void testing(Boolean actual, Boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests containAllRots");
        testing(allLnclusive.containAllRots("", Arrays.asList()), true);
        List<String> a = Arrays.asList("bsjq", "qbsj");
        testing(allLnclusive.containAllRots("", a), true);
        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        testing(allLnclusive.containAllRots("bsjq", a), true);
        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        testing(allLnclusive.containAllRots("XjYABhR", a), false);
    }
}