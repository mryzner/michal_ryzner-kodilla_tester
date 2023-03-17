package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void turnOn() { System.out.println("Welcome to the OperatingSystem"); }
    public void turnOff() { System.out.println("Good Bye"); }
    public int getReleaseYear() { return releaseYear; }
}
