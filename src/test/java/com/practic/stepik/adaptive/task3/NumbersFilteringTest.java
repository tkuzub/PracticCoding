package com.practic.stepik.adaptive.task3;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
public class NumbersFilteringTest {
    private NumbersFiltering numbersFiltering;

    @Before
    public void setup() {
        numbersFiltering = new NumbersFiltering();
    }

    @Test
    public void testCaseOne() {
        //given
        IntStream stream1 = IntStream.of(1, 2);
        IntStream stream2 = IntStream.of(3, 4);
        //when
        IntStream result = numbersFiltering.createFilteringStream(stream1, stream2);
        List<Integer> list = result.boxed().collect(Collectors.toList());
        //then
        assertEquals("[]", list.toString());
    }

    @Test
    public void testCaseTwo() {
        //given
        IntStream stream1 = IntStream.of(30, 75);
        IntStream stream2 = IntStream.of(60, 90);
        //when
        IntStream result = numbersFiltering.createFilteringStream(stream1, stream2);
        List<Integer> list = result.boxed().collect(Collectors.toList());
        //then
        assertEquals("[75, 90]", list.toString());
    }
}
