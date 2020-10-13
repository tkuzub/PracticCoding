package com.practic.codewars.functional.student.part1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AggregationKataTest {
    private Student[] students;
    private AggregationKata kata;

    @Before
    public void setUp() {
        Student galina = new Student("Galina", 95, "Philology", Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Gender.FEMALE);

        students = new Student[]{galina, anton, jack, mike, jane};
        kata = new AggregationKata();
    }

    @Test
    public void basicTestGetAverageGradeByDepartment() throws Exception {

        Map<String, Double> actual = kata.getAverageGradeByDepartment(Arrays.stream(students));
        Map<String, Double> expected = new HashMap<>();
        expected.put("CS", 77.5);
        expected.put("Philology", 79.0);

        assertEquals(expected, actual);
    }
}