package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonDataProvider#provideCorrectValuesForTestingBMI")
    public void shouldProperlyCalculateBMIWhenCorrectValuesAreGiven(double heightInMeters, double weightInKilogram, String expectedResult) {
        Person person = new Person(heightInMeters, weightInKilogram);
        String actualResult = person.getBMI();
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonDataProvider#provideIncorrectValues")
    public void shouldDetectBugInPersonClassIncorrectValuesArePossible(double heightInMeters, double weightInKilogram) {
        Person person = new Person(heightInMeters, weightInKilogram);
        String actualResult = person.getBMI();
        assertEquals("Very severely underweight", actualResult);
    }

}