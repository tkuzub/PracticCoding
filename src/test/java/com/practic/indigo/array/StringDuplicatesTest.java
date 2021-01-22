package com.practic.indigo.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringDuplicatesTest {
    private StringDuplicates stringDuplicates;

    @Before
    public void setUp() {
        stringDuplicates = new StringDuplicates();
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"codewars", "picaniny", "hubububo"}, stringDuplicates.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra", "alote", "asese"}, stringDuplicates.dup(new String[]{"abracadabra", "allottee", "assessee"}));
        assertArrayEquals(new String[]{"keles", "kenes"}, stringDuplicates.dup(new String[]{"kelless", "keenness"}));
    }
}