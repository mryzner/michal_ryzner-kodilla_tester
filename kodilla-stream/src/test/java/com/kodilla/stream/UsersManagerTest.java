package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    private List<String> expectedUsers;
    @BeforeEach
    private void setup() {
        expectedUsers = new ArrayList<>();
    }

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> result = UsersManager.filterChemistGroupUsernames();
        expectedUsers.add(new String("Walter White"));
        expectedUsers.add(new String("Gale Boetticher"));
        assertEquals(expectedUsers, result);
    }
    @Test
    public void testFilterAgeCriterionUsernames() {
        List<String> result = UsersManager.filterAgeCriterionUsernames(45);
        expectedUsers.add(new String("Walter White"));
        expectedUsers.add(new String("Gus Firing"));
        expectedUsers.add(new String("Mike Ehrmantraut"));
        assertEquals(expectedUsers, result);
    }
}