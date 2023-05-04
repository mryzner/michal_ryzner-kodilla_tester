package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator calculator = context.getBean(Calculator.class);
    @Test
    public void testIfCalculatorReturnsResult() {
        double result = calculator.add(1, 2);
        Assertions.assertNotNull(result);
    }
    @Test
    public void testAdding() {
        assertEquals(3.5, calculator.add(1.2, 2.3), 0.001);
    }
    @Test
    public void testSubtracting() {
        assertEquals(2, calculator.subtract(5, 3), 0.001);
    }
    @Test
    public void testMultiplying() {
        assertEquals(16, calculator.multiply(4, 4), 0.001);
    }
    @Test
    public void testDividing() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }
    @Test
    public void shouldThrowAnException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}