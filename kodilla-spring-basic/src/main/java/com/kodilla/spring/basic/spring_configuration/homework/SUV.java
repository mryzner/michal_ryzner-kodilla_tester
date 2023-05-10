package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    private boolean headlights;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlights;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }
}
