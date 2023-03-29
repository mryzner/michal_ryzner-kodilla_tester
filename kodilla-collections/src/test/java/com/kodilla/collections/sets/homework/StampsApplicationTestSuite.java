package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class StampsApplicationTestSuite {
    Set<Stamp> stamps = new HashSet<>();
    @Test
    public void shouldNotAddTwoIdenticalStamps() {
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));
        stamps.add(new Stamp("Old stamp", 5, 4, false));
        stamps.add(new Stamp("Nice stamp", 3, 4, true));
        stamps.add(new Stamp("Old stamp", 5, 4, false));
        stamps.add(new Stamp("Lovely stamp", 6, 2, false));
        stamps.add(new Stamp("Valuable stamp", 5, 4, true));
        stamps.add(new Stamp("Valuable stamp", 5, 4, true));
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));

        assertEquals(5, stamps.size());
    }
}
