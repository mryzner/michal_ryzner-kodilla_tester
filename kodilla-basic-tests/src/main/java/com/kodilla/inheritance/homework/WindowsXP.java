package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {
    public WindowsXP(int releaseYear) { super(releaseYear); }
    @Override
    public void turnOn() { System.out.println("Welcome to Windows XP"); }

    @Override
    public void turnOff() { System.out.println("Good Bye, we won't miss you!"); }
}
