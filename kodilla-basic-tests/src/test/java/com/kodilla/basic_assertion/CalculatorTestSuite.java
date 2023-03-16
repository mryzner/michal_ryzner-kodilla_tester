package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 8;
        double b = 5;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.01);
    }
}
