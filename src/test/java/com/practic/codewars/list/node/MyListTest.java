package com.practic.codewars.list.node;

import com.practic.codewars.list.node.MyList;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyListTest {
    private MyList listLength;
    
    @Before
    public void setUp()  {
        listLength = new MyList();
    }

    @Test
    public void basicTests() {
        assertEquals(0, listLength.length(null));
        assertEquals(4, listLength.length(listLength.listFromArray(Arrays.asList(1, 2, 3, 4))));
    }
}