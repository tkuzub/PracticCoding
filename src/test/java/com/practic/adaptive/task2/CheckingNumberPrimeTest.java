package com.practic.adaptive.task2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckingNumberPrimeTest {

    @Test
    public void testCase() {
        //given
        CheckingNumberPrime prime = new CheckingNumberPrime();
        //when
        //then
        assertTrue(prime.isPrime(2));
        assertTrue(prime.isPrime(3));
        assertFalse(prime.isPrime(4));
    }
}
