package com.practic.codewars.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueStringCharactersTest {
    private UniqueStringCharacters unique;

    public void setUp() {
        unique = new UniqueStringCharacters();
    }

    @Test
    public void basicTests(){
        assertEquals("ybzc",unique.solve("xyab","xzca"));
        assertEquals("ybbzc",unique.solve("xyabb","xzca"));
        assertEquals("abcdxyz",unique.solve("abcd","xyz"));
        assertEquals("zca",unique.solve("xxx","xzca"));
    }
}