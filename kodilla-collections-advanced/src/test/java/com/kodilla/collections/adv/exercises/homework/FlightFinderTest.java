package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTest {
    FlightFinder flightFinder = new FlightFinder(FlightFinder.flightList);
    @Test
    public void shouldAddFlightsCorrectly() {
        List<Flight> expectedFlights = new ArrayList<>();
        List<Flight> result = flightFinder.flightList;
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("Warsaw", "Paris"));
        expectedFlights.add(new Flight("London", "Berlin"));
        expectedFlights.add(new Flight("Paris", "New York"));
        expectedFlights.add(new Flight("New York", "Berlin"));
        expectedFlights.add(new Flight("Tokyo", "London"));
        //expectedFlights.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedFlights, result);
    }
    @Test
    public void testFindFlightsFrom() {
        List<Flight> expectedFlights = new ArrayList<>();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("Warsaw", "Paris"));
        //expectedFlights.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedFlights, result);
    }
    @Test
    public void testFindFlightsTo() {
        List<Flight> expectedFlights = new ArrayList<>();
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("London", "Berlin"));
        expectedFlights.add(new Flight("New York", "Berlin"));
        //expectedFlights.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedFlights, result);
    }
    @Test
    public void testNoSuchFlight() {
        List<Flight> expectedFlights = new ArrayList<>();
        List<Flight> result1 = flightFinder.findFlightsTo("Szczebrzeszyn");
        List<Flight> result2 = flightFinder.findFlightsFrom("Szczekociny");
        assertEquals(expectedFlights, result1);
        assertEquals(expectedFlights, result2);
    }
    @Test
    public void testEmptyEntry() {
        List<Flight> expectedFlights = new ArrayList<>();
        List<Flight> result = flightFinder.findFlightsTo("");
        assertEquals(expectedFlights, result);
    }
}
