package com.practic.codewars.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumminatorTest {
    private ArraySumminator summinator;

    @Before
    public void setUp()  {
        summinator = new ArraySumminator();
    }

    @Test
    public void exampleTests() {
        System.out.println("Should return 4258");
        assertEquals(4258, summinator.sumItUp(new ArraySumminator.BasedNumbers[] {new ArraySumminator.BasedNumbers("101",16),new ArraySumminator.BasedNumbers("7640",8),new ArraySumminator.BasedNumbers("1",9)}));
        System.out.println("Should return 13");
        assertEquals(13, summinator.sumItUp(new ArraySumminator.BasedNumbers[] {new ArraySumminator.BasedNumbers("101",2),new ArraySumminator.BasedNumbers("10",8)}));
        System.out.println("Should return 2751");
        assertEquals(2751, summinator.sumItUp(new ArraySumminator.BasedNumbers[] {new ArraySumminator.BasedNumbers("ABC",16),new ArraySumminator.BasedNumbers("11",2)}));
    }
}