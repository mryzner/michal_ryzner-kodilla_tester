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

    public Set<Flight> findFlightsTo(String arrival) {
        Set<Flight> destinationAirport = new HashSet<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                destinationAirport.add(flight);
            }
        }
        return destinationAirport;
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
    }

}
