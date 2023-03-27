package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    private int speed;
    public Opel(int speed) {
        this.speed = speed;
        //System.out.println("Opel");
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed = speed + 8;
    }
    @Override
    public void decreaseSpeed() {
        speed = speed - 5;
    }
    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
