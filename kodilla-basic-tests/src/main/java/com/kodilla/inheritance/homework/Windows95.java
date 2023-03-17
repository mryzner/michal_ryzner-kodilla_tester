package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem {
    public Windows95(int releaseYear) { super(releaseYear); }
    @Override
    public void turnOn() { System.out.println("Welcome to Windows 95"); }

    @Override
    public void turnOff() { System.out.println("Good Bye, we will miss you!"); }

}
