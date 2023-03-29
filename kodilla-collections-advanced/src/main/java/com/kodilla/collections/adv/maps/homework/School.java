package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classesSize = new ArrayList<>();

    public School(String name, List<Integer> classesSize) {
        this.name = name;
        this.classesSize = classesSize ;
    }
    public int getSumOfAllClasses() {
        int sum = 0;
        for(int size: classesSize) {
            sum = sum + size;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    /*public List<Integer> getClassesSize() {
        return classesSize;
    }*/
}
