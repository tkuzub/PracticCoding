/*Java 8 has introduced a sexy new Stream API which makes it possible to solve some data related problems in
just a few lines of code. Let's try it out!

You have a Student class (see the class declaration below).

You have an array of students and you want to get some aggregate data.

THE TASK: get the the number of students by gender for each department. (i.e. "CS" department has 2 males,
3 females, "Economics" department has 4 males, 5 females, etc.)

Implement the method using Java 8 Stream API.

Have Fun!

Student class declaration:*/

package com.practic.codewars.functional.student.part4;

import java.util.Map;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class AggregationKata4 {
    public static Map<String, Map<Student.Gender, Long>> get(Stream<Student> students) {
        return students.collect(groupingBy(Student::getDepartment, groupingBy(Student::getGender, counting())));
    }
}
