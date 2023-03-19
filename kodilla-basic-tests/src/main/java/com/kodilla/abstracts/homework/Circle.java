package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private static double PI = 3.1415927;
    private double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;
        System.out.println("Koło");
    }

    public double getRadius() { return radius; }
    @Override
    public void calculateArea() {
        double area = PI*(radius*radius);
        System.out.println("Pole koła: " + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = (2*PI)*radius;
        System.out.println("Obwód koła: " + perimeter);
    }
}
