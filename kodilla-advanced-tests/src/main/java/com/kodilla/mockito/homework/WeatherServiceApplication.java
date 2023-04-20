package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Location;

import java.util.Set;

public class WeatherServiceApplication {
    public static void main(String[] args) {
        WeatherService service = new WeatherService();
        Location warszawa = new Location() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        Location katowice = new Location() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        service.addLocation(warszawa);
        Set<Location> result1 = service.findLocation(warszawa);
        Set<Location> result2 = service.findLocation(katowice);
        System.out.println(result1.size());
        System.out.println(result2.size());
    }
}
