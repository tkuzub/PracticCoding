package com.practic.pattern.mvc.var1;

public class MVCDemo {
    public static void main(String[] args) {

    }
}

interface ModelLayer {
    Student getStudent();
}

class DBLayer implements ModelLayer {

    @Override
    public Student getStudent() {
        return new Student();
    }
}

interface View {
    void showStudent(Student student);
}

class ConsoleView implements View {

    @Override
    public void showStudent(Student student) {
        System.out.println("student name " + student.getName() + ", student age " + student.getAge());
    }
}

class Controller {
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleView();

    public void execute() {
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}