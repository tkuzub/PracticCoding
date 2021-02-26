package com.practic.indigo.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestVowelChainTest {
    private LongestVowelChain vowelChain;

    @Before
    public void setUp() {
        vowelChain = new LongestVowelChain();
    }

    @Test
    public void basicTests(){
        assertEquals(3,vowelChain.solve("ultrarevolutionariees"));
        assertEquals(2,vowelChain.solve("codewarriors"));
        assertEquals(3,vowelChain.solve("suoidea"));
        assertEquals(1,vowelChain.solve("strengthlessnesses"));
        assertEquals(11,vowelChain.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
    }
}