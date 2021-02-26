package com.practic.indigo.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAndStarTest {
    private SortAndStar sortStar;

    @Before
    public void setUp() {
        sortStar = new SortAndStar();
    }

    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", sortStar.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", sortStar.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}