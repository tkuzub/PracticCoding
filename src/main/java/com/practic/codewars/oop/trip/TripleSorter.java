package com.practic.codewars.oop.trip;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TripleSorter {

    static class Student {
        private String name;
        private int age;
        private int gpa;

        public Student(int age, int gpa, String name) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gpa=" + gpa +
                    '}';
        }
    }
    public String sort(List<Student> students) {
        StudentComparator studentComparator = new StudentComparator();
        students.sort(studentComparator);
        return students.stream().map(Student::getName).collect(Collectors.joining(","));
    }

    static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            int result = s2.gpa - s1.gpa;
            if (result == 0) {
                return s2.getName().compareTo(s1.getName());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));
        students.add(new Student(25, 82, "Mark Rose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 90, "Jane Dane"));

        TripleSorter tripleSorter = new TripleSorter();
        String output = tripleSorter.sort(students);
        System.out.println(output);
    }
}
