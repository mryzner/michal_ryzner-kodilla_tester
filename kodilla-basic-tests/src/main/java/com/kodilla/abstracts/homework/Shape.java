package com.kodilla.abstracts.homework;

public abstract class Shape {
    static int counter = 0;
    public Shape() {
        counter++;
        System.out.println("Figura nr: " + counter);
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
