package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(25);
        cars.add(ford);
        cars.add(new Seat(35));
        cars.add(new Opel(30));
        cars.add(new Trabant(15));

        cars.remove(3);
        cars.remove(ford);

        Opel opel = new Opel(30);
        cars.remove(opel);

        System.out.println("Size: " + cars.size());

        for (Car car: cars) {
            CarUtils.describeCar(car);
        }
    }
}
