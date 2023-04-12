package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTestSuite2 {
    private NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldReturnTrueIfNumberEqualsThree() {
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsAMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(12);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsEqualsZero() {
        boolean result = numberChecker.isDivisibleByThree(0);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsANegativeMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(-6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotDivisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(2);
        assertFalse(result);
    }
}