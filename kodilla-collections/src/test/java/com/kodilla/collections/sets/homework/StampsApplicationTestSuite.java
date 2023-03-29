package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class StampsApplicationTestSuite {
    Set<Stamp> stamps = new HashSet<>();
    @Test
    public void shouldAddStampToTheSet() {
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));
        assertEquals(1, stamps.size());
    }
    @Test
    public void shouldNotAddIdenticalStampsToTheSet() {
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));

        assertEquals(1, stamps.size());
    }
}
