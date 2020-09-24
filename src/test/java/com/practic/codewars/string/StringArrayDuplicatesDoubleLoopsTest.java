package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringArrayDuplicatesDoubleLoopsTest {
    private StringArrayDuplicatesDoubleLoops duplicates;
    
    @Before
    public void setUp() {
        duplicates = new StringArrayDuplicatesDoubleLoops();
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"codewars","picaniny","hubububo"},duplicates.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra","alote","asese"},duplicates.dup(new String[]{"abracadabra","allottee","assessee"}));
        assertArrayEquals(new String[]{"keles","kenes"},duplicates.dup(new String[]{"kelless","keenness"}));
    }
}