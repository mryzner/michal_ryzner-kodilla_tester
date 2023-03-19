package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double side;
    public Square(double side) {
        super();
        this.side = side;
        System.out.println("Kwadrat");
    }

    public double getSide() { return side; }

    @Override
    public void calculateArea() {
        double area = side*side;
        System.out.println("Pole kwadratu: " + area);
    }
    @Override
    public void calculatePerimeter() {
        double perimeter = side*4;
        System.out.println("Obwód kwadratu: " + perimeter);
    }
}
