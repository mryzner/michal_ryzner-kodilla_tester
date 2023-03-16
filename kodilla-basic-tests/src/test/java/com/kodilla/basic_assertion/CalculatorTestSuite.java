package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 8.5;
        double b = 5.4;
        double sumResult = calculator.sum(a, b);
        assertEquals(13.9, sumResult, 0.01);
    } // assertEquals(16, calculator.sum(4, 12), 0.01);
    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.power(-4), 0.01);
        assertEquals(0, calculator.power(0), 0.01);
        assertEquals(4, calculator.power(2), 0.01);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(6.8, calculator.subtract(8.9, 2.1), 0.01);
    }
}
