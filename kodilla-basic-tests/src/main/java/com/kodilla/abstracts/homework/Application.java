package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        processSquare();
        processRectangle();
        processCircle();
    }
    private static void processSquare() {
        Square square = new Square(4);
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println("Bok kwadratu: " + square.getSide());
        System.out.println(" ");
    }
    private static void processRectangle() {
        Rectangle rectangle = new Rectangle(4, 8);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("Boki prostokąta: " + rectangle.getSide1() + " i " + rectangle.getSide2());
        System.out.println(" ");
    }
    private static void processCircle() {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println("Promień koła: " + circle.getRadius());
    }
}
