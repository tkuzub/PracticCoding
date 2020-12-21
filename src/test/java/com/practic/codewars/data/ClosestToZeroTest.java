package com.practic.codewars.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClosestToZeroTest {
    private ClosestToZero closestToZero;

    @Before
    public void setUp() {
        closestToZero = new ClosestToZero();
    }

    @Test
    public void find() {
        assertEquals( Integer.valueOf( 1 ), closestToZero.find( new int[] { 10, 3, 9, 1 } ) );
        assertEquals( Integer.valueOf( -1 ), closestToZero.find( new int[] { 2, 4, -1, -3 } ) );
        assertEquals( Integer.valueOf( 0 ), closestToZero.find( new int[] { 13, 0, -6 } ) );
        assertEquals( Integer.valueOf( -2147483648 ), closestToZero.find( new int[] {-2147483648} ));

    }

    @Test
    public void shouldReturnNone() {
        assertNull(closestToZero.find(new int[]{5, 1, -1, 2, -10}));
        assertNull(closestToZero.find(new int[]{5, 11, 11, 2, -1, 1}));
    }
}