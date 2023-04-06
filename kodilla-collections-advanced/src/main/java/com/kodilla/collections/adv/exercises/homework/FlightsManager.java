package com.kodilla.collections.adv.exercises.homework;

public class FlightsManager {
    public static void main(String[] args) {
        processFlightsStream();
    }
    private static void processFlightsStream() {
        FlightRepository.getFlightsTable()
                .stream()
                .filter(flight -> flight.getDeparture().equals("Warsaw"))
                .map(flight -> flight.getDeparture())
                .forEach(departure -> System.out.println(departure));
        System.out.println("Koniec");
    }
}
