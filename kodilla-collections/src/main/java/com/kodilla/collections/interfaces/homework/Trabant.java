package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Trabant implements Car {
    private int speed;
    public Trabant(int speed) {
        this.speed = speed;
        //System.out.println("Trabant");
    }
    @Override
    public int getSpeed() { return speed; }

    @Override
    public void increaseSpeed() { speed = speed + 6; }

    @Override
    public void decreaseSpeed() { speed = speed -5; }
    @Override
    public String toString() {
        return "Trabant{" +
                "speed=" + speed +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabant trabant = (Trabant) o;
        return speed == trabant.speed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
