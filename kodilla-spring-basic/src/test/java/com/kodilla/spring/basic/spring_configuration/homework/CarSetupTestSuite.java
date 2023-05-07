package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarSetupTestSuite {

    @Test
    public void shouldSelectCorrectCarTypeDependingOnSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        LocalDate date = LocalDate.of(2010, 12, 22);
        Car car = (Car) context.getBean("selectCarType");
        String carType = car.getCarType();
        assertEquals("Sedan", carType);
    }

    @Test
    public void shouldReturnHeadlightsAreOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCarType");
        String testTime = "11:30";
        LocalTime localTime = LocalTime.parse(testTime);
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnHeadlightsAreOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        LocalTime testTime = LocalTime.of(21, 30);
        Car car = (Car) context.getBean("selectCarType", testTime);
        boolean headlightsStatus = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(headlightsStatus);
    }
}