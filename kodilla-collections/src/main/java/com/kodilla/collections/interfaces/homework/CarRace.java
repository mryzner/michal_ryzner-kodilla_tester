package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(0);
        doRace(ford);
        Opel opel = new Opel(0);
        doRace(opel);
        Seat seat = new Seat(0);
        doRace(seat);

        int res1 = ford.getSpeed();
        int res2 = opel.getSpeed();
        int res3 = seat.getSpeed();

        if (res1 > res2 && res1 > res3) { System.out.println("The winner is: Ford !"); }
        else if (res2 > res1 && res2 > res3) { System.out.println("The winner is: Opel !"); }
        else if (res3 > res1 && res3 > res2) { System.out.println("The winner is: Seat !"); }
        else { System.out.println("No winner !"); }
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
