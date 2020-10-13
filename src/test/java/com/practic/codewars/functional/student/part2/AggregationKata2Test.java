package com.practic.codewars.functional.student.part2;

import com.practic.codewars.functional.student.part3.Gender;
import com.practic.codewars.functional.student.part3.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AggregationKata2Test {
    private Student[] students;
    private AggregationKata2 kata;

    @Before
    public void setUp() {
        kata = new AggregationKata2();
        students = new Student[]{
                new Student("Galina", 95, "Philology", Gender.FEMALE),
                new Student("Anton", 90, "CS", Gender.MALE),
                new Student("Jack", 82, "Philology", Gender.MALE),
                new Student("Mike", 60, "Philology", Gender.MALE),
                new Student("Jane", 65, "CS", Gender.FEMALE)};
    }

    @Test
    public void basicTestGetStudentNamesByDepartment() {
        Map<String, Long> actual = kata.getNumberOfStudentsByDepartment(Arrays.stream(students));
        Map<String, Long> expected = new HashMap<>();
        expected.put("CS", 2L);
        expected.put("Philology", 3L);

        assertEquals(expected, actual);
    }
}