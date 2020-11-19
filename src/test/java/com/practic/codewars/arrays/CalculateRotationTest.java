package com.practic.codewars.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateRotationTest {
    private CalculateRotation rotation;

    @Before
    public void setUp() {
        rotation = new CalculateRotation();
    }

    @Test
    public void test() {
        assertEquals(-1, rotation.shiftedDiff("hoop","pooh"));
        assertEquals(0, rotation.shiftedDiff("hoop","hoop"));
        assertEquals(2, rotation.shiftedDiff("coffee","eecoff"));
        assertEquals(4, rotation.shiftedDiff("eecoff","coffee"));
    }
}