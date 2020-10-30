package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestVowelChainTest {
    private LongestVowelChain chain;

    @Before
    public void setUp() {
        chain = new LongestVowelChain();
    }

    @Test
    public void basicTests() {
        assertEquals(3, chain.solve("ultrarevolutionariees"));
        assertEquals(2, chain.solve("codewarriors"));
        assertEquals(3, chain.solve("suoidea"));
        assertEquals(1, chain.solve("strengthlessnesses"));
        assertEquals(11, chain.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
    }
}