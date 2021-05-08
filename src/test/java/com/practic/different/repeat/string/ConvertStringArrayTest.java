package com.practic.different.repeat.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertStringArrayTest {
    private ConvertStringArray convert;

    @Before
    public void setUp() {
        convert = new ConvertStringArray();
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, convert.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"},
                convert.stringToArray("I love arrays they are my favorite"));
    }
}