package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed;
    public Ford(int speed) {
        this.speed = speed;
        //System.out.println("Ford");
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed = speed + 10;
    }
    @Override
    public void decreaseSpeed() {
        speed = speed - 5;
    }
    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
