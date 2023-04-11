package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application2 {
    public static void main(String[] args) {
        List<Student> studentsList = getStudentsList();
        //getStudentsList();
        System.out.println(studentsList);
    }
    public static List<Student> getStudentsList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", new Teacher("Hans Schmidt")));
        students.add(new Student("Roger Newman", new Teacher("Rüdiger Neumann")));
        students.add(new Student("Paul Shoemaker", new Teacher("Paul Schumacher")));
        students.add(new Student("Mickey Rourke", null));
        students.add(new Student("Mark Fisher", new Teacher("Markus Fischer")));
        students.add(new Student("Harrison Ford", null));

        /*for(Student student: students) {
            System.out.println("student: " + student.getName() + ", teacher: " + getTeacherName(student) );
        }*/

        return students;
    }
    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName =
                optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return teacherName;
    }
}
