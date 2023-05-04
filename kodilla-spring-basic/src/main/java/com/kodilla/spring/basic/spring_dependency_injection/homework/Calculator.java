package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }
    public double add(double a, double b) {
        return display.display(a + b);
    }
    public double subtract(double a, double b) {
        return display.display(a - b);
    }
    public double multiply(double a, double b) {
        return display.display(a * b);
    }
    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        else {
            return display.display(a / b);
        }
    }
}
