package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CandyApplicationTest {
    private List<String> expectedCandies;
    @BeforeEach
    public void setup() {
        expectedCandies = new ArrayList<>();
    }
    @Test
    public void testFilterCandiesByType() {
        List<String> result = CandyApplication.filterCandiesByType("chocolate");
        expectedCandies.add(new String("Milka"));
        expectedCandies.add(new String("Wedel"));
        assertEquals(expectedCandies, result);
    }
    @Test
    public void testFilterCandiesByWeight() {
        List<String> result = CandyApplication.filterCandiesByWeight(70);
        expectedCandies.add(new String("Snickers"));
        expectedCandies.add(new String("Mars"));
        assertEquals(expectedCandies, result);
    }

}