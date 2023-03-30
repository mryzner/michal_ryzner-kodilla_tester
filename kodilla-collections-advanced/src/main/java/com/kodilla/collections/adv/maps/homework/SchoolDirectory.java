package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalsToSchools = new HashMap<>();
        Principal principal1 = new Principal("John", "Wayne");
        Principal principal2 = new Principal("Sylvester", "Stallone");
        Principal principal3 = new Principal("Clint", "Eastwood");

        School school1 = new School("Big school", Arrays.asList(25, 19, 30, 29, 20));
        School school2 = new School("Modern school", Arrays.asList(16,17,18,19));
        School school3 = new School("Old school", Arrays.asList(22,24,26));

        principalsToSchools.put(principal1, school1);
        principalsToSchools.put(principal2, school2);
        principalsToSchools.put(principal3, school3);

        for (Map.Entry<Principal, School> principalSchoolEntry: principalsToSchools.entrySet()) {
            System.out.println("Principal: " + principalSchoolEntry.getKey().getFirstname()
                    + " " + principalSchoolEntry.getKey().getLastname() + "   " + "School: "
                    + principalSchoolEntry.getValue().getName() + "   Number of all pupils: "
                    + principalSchoolEntry.getValue().getSumOfAllClasses());
        }
    }
}
