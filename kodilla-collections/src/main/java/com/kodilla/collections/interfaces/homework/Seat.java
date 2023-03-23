package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {
    private int speed;
    public Seat(int speed) {
        this.speed = speed;
        System.out.println("Seat");
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed = speed + 12;
    }
    @Override
    public void decreaseSpeed() {
        speed = speed - 6;
    }
}
