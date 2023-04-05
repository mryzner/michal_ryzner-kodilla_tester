package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightFinderTest {
    private FlightFinder flightFinder;
    private List<Flight> expectedFlights;

    @BeforeEach
    private void init() {
        flightFinder = new FlightFinder(FlightRepository.getFlightsTable());
        expectedFlights = new ArrayList<>();
    }

    @Test
    public void testFindFlightsFrom() {
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("Warsaw", "Paris"));
        assertEquals(expectedFlights, result);
        /*assertTrue(expectedFlights.size() == result.size()
                && expectedFlights.containsAll(result)
                && result.containsAll(expectedFlights));*/
    }
    @Test
    public void testFindFlightsTo() {
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        expectedFlights.add(new Flight("Warsaw", "Berlin"));
        expectedFlights.add(new Flight("London", "Berlin"));
        expectedFlights.add(new Flight("New York", "Berlin"));
        assertEquals(expectedFlights, result);
        /*assertTrue(expectedFlights.size() == result.size()
                && expectedFlights.containsAll(result)
                && result.containsAll(expectedFlights));*/
    }
    @Test
    public void testNoSuchFlight() {
        List<Flight> result1 = flightFinder.findFlightsTo("Szczebrzeszyn");
        List<Flight> result2 = flightFinder.findFlightsFrom("Szczekociny");
        assertEquals(expectedFlights, result1);
        assertEquals(expectedFlights, result2);
    }
    @Test
    public void testNullEntry() {
        List<Flight> result = flightFinder.findFlightsTo(null);
        assertEquals(expectedFlights, result);
    }
}
