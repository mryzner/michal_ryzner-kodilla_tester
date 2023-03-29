package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal john = new Principal("John", "Wayne");
        Principal sylvester = new Principal("Sylvester", "Stallone");
        Principal clint = new Principal("Clint", "Eastwood");

        School school1 = new School("Big school", Arrays.asList(25, 19, 30, 29, 20));
        School school2 = new School("Modern school", Arrays.asList(16,17,18,19));
        School school3 = new School("Old school", Arrays.asList(22,24,26));

        schools.put(john, school1);
        schools.put(sylvester, school2);
        schools.put(clint, school3);

        for (Map.Entry<Principal, School> example: schools.entrySet()) {
            System.out.println("Principal: " + example.getKey().getFirstname() + " " + example.getKey().getLastname() + "  "
                    + "School: " + example.getValue().getName() + "  Number of all pupils: " + example.getValue().getSumOfAllClasses());
        }
    }
}
