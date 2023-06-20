package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {
    @Test
    void shouldBeLeapYearIfDivisibleBy400() {

        Year year = new Year(1600);

        boolean isLeapYear = year.isLeap();

        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy400ButDivisibleBy4() {

        Year year = new Year(1700);

        boolean isLeapYear = year.isLeap();

        assertFalse(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4AndNotBy100() {

        Year year = new Year(2020);

        boolean isLeapYear = year.isLeap();

        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {

        Year year = new Year(2023);

        boolean isLeapYear = year.isLeap();

        assertFalse(isLeapYear);
    }
}