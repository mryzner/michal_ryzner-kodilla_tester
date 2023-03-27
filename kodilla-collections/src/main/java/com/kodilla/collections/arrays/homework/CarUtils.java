package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Seat)
            return "Seat";
        else
            return "Trabant";
    }
}
