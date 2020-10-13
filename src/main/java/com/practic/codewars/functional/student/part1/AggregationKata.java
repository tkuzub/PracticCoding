package com.practic.codewars.functional.student.part1;

import java.util.Map;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class AggregationKata {
    public  Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        return students.collect(groupingBy(Student::getDepartment, averagingDouble(Student::getGrade)));
    }
}
