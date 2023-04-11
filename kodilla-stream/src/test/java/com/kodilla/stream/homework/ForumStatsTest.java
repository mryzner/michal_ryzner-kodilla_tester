package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void testAverageNumberOfPostsUsersAgeOver40() {
        double result = ForumStats.averageNumberOfPostsUsersAgeOver40();
        assertEquals(2.25, result);
    }
    @Test
    public void testAverageNumberOfPostsUsersAgeBelow40() {
        double result = ForumStats.averageNumberOfPostsUsersAgeBelow40();
        assertEquals(2382, result);
    }

}