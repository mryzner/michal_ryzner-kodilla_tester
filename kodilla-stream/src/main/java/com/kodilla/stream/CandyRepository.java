package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class CandyRepository {
    public static List<Candy> getCandiesList() {
        List<Candy> candies = new ArrayList<>();
        candies.add(new Candy("Milka", "chocolate", 100, 5));
        candies.add(new Candy("Wedel", "chocolate", 90, 4));
        candies.add(new Candy("Snickers", "bar", 50, 3));
        candies.add(new Candy("Mars", "bar", 45, 2.5));
        candies.add(new Candy("Nutella", "spread", 500, 50));

        return candies;
    }

}
