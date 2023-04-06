package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", new Teacher("Hans Schmidt")));
        students.add(new Student("Rodger Newman", new Teacher("Rüdiger Neumann")));
        students.add(new Student("Paul Shoemaker", new Teacher("Paul Schumacher")));
        students.add(new Student("Mickey Rourke", new Teacher(null)));
    }
}
