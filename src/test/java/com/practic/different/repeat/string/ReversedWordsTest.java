package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedWordsTest {
    private ReversedWords reversedWords;

    @Before
    public void setUp() {
        reversedWords = new ReversedWords();
    }

    @Test
    public void testSomething() {
        assertEquals("eating like I", reversedWords.reverseWords("I like eating"));
        assertEquals("flying like I", reversedWords.reverseWords("I like flying"));
        assertEquals("nice is world The", reversedWords.reverseWords("The world is nice"));
    }
}