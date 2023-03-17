package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        checkSystems();
    }
    private static void checkSystems() {
        OperatingSystem operatingSystem = new OperatingSystem(1956);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("First OS was released in " + operatingSystem.getReleaseYear());
        System.out.println(" ");

        Windows95 windows95 = new Windows95(1995);
        windows95.turnOn();
        windows95.turnOff();
        System.out.println("Windows 95 was released in " + windows95.getReleaseYear());
        System.out.println(" ");

        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.turnOn();
        windowsXP.turnOff();
        System.out.println("Windows XP was released in " + windowsXP.getReleaseYear());
    }
}
