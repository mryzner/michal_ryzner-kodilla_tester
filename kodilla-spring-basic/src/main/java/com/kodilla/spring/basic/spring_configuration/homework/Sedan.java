package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sedan implements Car {
    LocalTime currentTime = LocalTime.now();
    LocalTime dayStart = LocalTime.of(6, 00);
    LocalTime dayEnd = LocalTime.of(20, 00);
    @Override
    public boolean hasHeadlightsTurnedOn() {
        if(currentTime.isAfter(dayEnd) && currentTime.isBefore(dayStart)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
