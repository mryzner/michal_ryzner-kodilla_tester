package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    public static List<Flight> flightList = FlightRepository.getFlightsTable();

    public FlightFinder(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> originAirport = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getDeparture().equals(departure)) {
                originAirport.add(flight);
            }
        }
        return originAirport;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> destinationAirport = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getArrival().equals(arrival)) {
                destinationAirport.add(flight);
            }
        }
        return destinationAirport;
    }
}
