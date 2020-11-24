package com.practic.codewars.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenSortTest {
    private OddEvenSort oddEvenSort;

    @Before
    public void setUp() {
        oddEvenSort = new OddEvenSort();
    }

    @Test
    public void testSomething() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", oddEvenSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", oddEvenSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", oddEvenSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", oddEvenSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", oddEvenSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        assertEquals("SBEMTGYHC UDRAOLPI", oddEvenSort.sortMyString("SUBDERMATOGLYPHIC"));
    }
}