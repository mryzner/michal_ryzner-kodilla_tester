package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonDataProvider {
    static Stream<Arguments> provideCorrectValuesForTestingBMI() {
        return Stream.of(
                Arguments.of(1.80, 45.0, "Very severely underweight"),
                Arguments.of(1.80, 50.0, "Severely underweight"),
                Arguments.of(1.80, 55.0, "Underweight"),
                Arguments.of(1.80, 75.0, "Normal (healthy weight)"),
                Arguments.of(1.80, 90.0, "Overweight"),
                Arguments.of(1.80, 105.0, "Obese Class I (Moderately obese)"),
                Arguments.of(1.80, 120.0, "Obese Class II (Severely obese)"),
                Arguments.of(1.80, 135.0, "Obese Class III (Very severely obese)"),
                Arguments.of(1.80, 150.0, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.80, 185.0, "Obese Class V (Super Obese)"),
                Arguments.of(1.80, 200.0, "Obese Class VI (Hyper Obese)")
        );
    }
    static Stream<Arguments> provideIncorrectValues() {
        return Stream.of(
                Arguments.of(1.80, 0),
                Arguments.of(1.80, -70.0),
                Arguments.of(0, -70.0),
                Arguments.of(-1.80, -70.0)
        );
    }

}
