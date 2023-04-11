package com.kodilla.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> expectedUsers = new ArrayList<>();
        List<String> result = UsersManager.filterChemistGroupUsernames();
        expectedUsers.add(new String("Walter White"));
        expectedUsers.add(new String("Gale Boetticher"));
        assertEquals(expectedUsers, result);
    }
    @Test
    public void testFilterUsersByAge() {
        List<User> expectedUsers = new ArrayList<>();
        List<User> result = UsersManager.filterUsersByAge(44);
        expectedUsers.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsers.add(new User("Gus Firing", 49, 0, "Board"));
        expectedUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedUsers, result);
    }
    @Test
    public void testFilterUsersByAgeBoundaryValue() {
        List<User> expectedUsers = new ArrayList<>();
        List<User> result = UsersManager.filterUsersByAge(44);
        expectedUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        assertNotEquals(expectedUsers, result);
    }
}