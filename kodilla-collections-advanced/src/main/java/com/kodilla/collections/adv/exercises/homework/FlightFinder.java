package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> originAirport = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                originAirport.add(flight);
            }
        }
        return originAirport;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> destinationAirport = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                destinationAirport.add(flight);
            }
        }
        return destinationAirport;
    }
}
