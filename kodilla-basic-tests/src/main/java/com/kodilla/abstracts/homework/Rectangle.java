package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private double side1;
    private double side2;
    public Rectangle(double side1, double side2) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        System.out.println("Prostokąt");
    }

    public double getSide1() { return side1; }

    public double getSide2() { return side2; }
    @Override
    public void calculateArea() {
        double area = side1*side2;
        System.out.println("Pole prostokąta: " + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = (2*side1) + (2*side2);
        System.out.println("Obwód prostokąta: " + perimeter);
    }
}
