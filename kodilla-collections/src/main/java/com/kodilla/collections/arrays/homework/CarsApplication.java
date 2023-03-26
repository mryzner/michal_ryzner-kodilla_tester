package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car: cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarName = random.nextInt(3);
        int acceleration = random.nextInt(31);
        if (drawnCarName == 0)
            return new Ford(0 + acceleration);
        else if (drawnCarName == 1)
            return new Opel(0 + acceleration);
        else {
            return new Seat(0 + acceleration);
        }
    }
}