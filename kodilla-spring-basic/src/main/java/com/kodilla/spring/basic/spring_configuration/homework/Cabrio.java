package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    private boolean headlights;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlights;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }
}
