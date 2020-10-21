package com.practic.codewars.list.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CircleOfPeopleTest {
    private CircleOfPeople circleOfPeople;

    @Before
    public void setUp()  {
        circleOfPeople = new CircleOfPeople();
    }

    @Test
    public void test5Persons() {
        List<String> list = new ArrayList<>(Arrays.asList("Bob", "Lorna", "Desiree", "Melissa", "Josh"));

        assertEquals(circleOfPeople.crossingOut(list), Arrays.asList("Lorna", "Melissa", "Bob", "Josh"));
    }

    @Test
    public void test6Persons() {
        List<String> list = new ArrayList<>(Arrays.asList("Bob", "Lorna", "Desiree", "Melissa", "Josh", "Gerry"));

        assertEquals(circleOfPeople.crossingOut(list), Arrays.asList("Lorna", "Melissa", "Gerry", "Desiree", "Bob"));
    }
}