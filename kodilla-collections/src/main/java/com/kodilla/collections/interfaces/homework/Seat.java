package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Seat implements Car {
    private int speed;
    public Seat(int speed) {
        this.speed = speed;
        //System.out.println("Seat");
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
    @Override
    public String toString() {
        return "Seat{" +
                "speed=" + speed +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return speed == seat.speed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
