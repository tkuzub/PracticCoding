package com.practic.codewars.oop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {
    private Dictionary dictionary;

    @Before
    public void setUp() {
        dictionary = new Dictionary();
    }

    @Test
    public void Tests() {

        dictionary.newEntry("Apple", "A fruit");
        assertEquals("A fruit", dictionary.look("Apple"));

        dictionary.newEntry("Soccer", "A sport");
        assertEquals("A sport", dictionary.look("Soccer"));

        assertEquals("Cant find entry for Hi", dictionary.look("Hi"));
        assertEquals("Cant find entry for Ball", dictionary.look("Ball"));

        dictionary.newEntry("soccer", "a sport");
        assertEquals("a sport", dictionary.look("soccer"));
    }
}