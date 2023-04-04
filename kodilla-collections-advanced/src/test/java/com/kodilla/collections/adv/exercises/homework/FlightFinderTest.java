package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();


    @Test
    public void shouldAddFlightsCorrectly() {
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("Warsaw", "Paris"));
        expectedFlights.add(new Flight("London", "Berlin"));
        expectedFlights.add(new Flight("Paris", "New York"));
        expectedFlights.add(new Flight("New York", "Berlin"));
        expectedFlights.add(new Flight("Tokyo", "London"));
        assertEquals(expectedFlights, FlightRepository.getFlightsTable());
    }

    @Test
    public void testFindFlightsFrom() {
        List<Flight> expectedFlights = new LinkedList<>();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("Warsaw", "Paris"));
        assertEquals(expectedFlights, result);
    }
    @Test
    public void testFindFlightsTo() {
        Set<Flight> expectedFlights = new HashSet<>();
        Set<Flight> result = flightFinder.findFlightsTo("Berlin");
        expectedFlights.add(new Flight("New York", "Berlin"));
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("London", "Berlin"));
        assertEquals(expectedFlights, result);
    }
}