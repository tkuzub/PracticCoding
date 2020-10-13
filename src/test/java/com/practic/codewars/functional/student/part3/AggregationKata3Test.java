package com.practic.codewars.functional.student.part3;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AggregationKata3Test {
    private Student[] students;
    private AggregationKata3 kata;

    @Before
    public void setUp() {
        kata = new AggregationKata3();
        students = new Student[]{
                new Student("Galina", 95, "Philology", Gender.FEMALE),
                new Student("Anton", 90, "CS", Gender.MALE),
                new Student("Jack", 82, "Philology", Gender.MALE),
                new Student("Mike", 60, "Philology", Gender.MALE),
                new Student("Jane", 65, "CS", Gender.FEMALE)};
    }

    @Test
    public void basicTestGetStudentNamesByDepartment() {
        Map<String, List<String>> actual = kata.getStudentNamesByDepartment(Arrays.stream(students));

        Map<String, List<String>> expected = new HashMap<>();
        List<String> list1 = new ArrayList<>(Arrays.asList("Galina", "Jack", "Mike"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Anton", "Jane"));

        expected.put("CS", list2);
        expected.put("Philology", list1);

        assertEquals(expected, actual);
    }
}