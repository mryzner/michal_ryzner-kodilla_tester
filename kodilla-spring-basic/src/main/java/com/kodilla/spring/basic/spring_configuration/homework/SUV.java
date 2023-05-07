package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SUV implements Car {
    LocalDateTime currentTime = LocalDateTime.now();

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if(currentTime.getHour() >= 20 || currentTime.getHour() > 0 && currentTime.getHour() < 6) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
