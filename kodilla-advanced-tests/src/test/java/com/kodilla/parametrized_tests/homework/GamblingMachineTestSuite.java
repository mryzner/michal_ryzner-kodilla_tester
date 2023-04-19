package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineValues.csv", numLinesToSkip = 1, delimiter = ',')
    public void shouldThrowException(String input) {
        String [] arrayOfStrings = input.split(",");
        Set <Integer> numbers = Arrays.stream(arrayOfStrings).map(i -> Integer.valueOf(i)).collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));

    }
}