package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();
    @ParameterizedTest
    @ValueSource(strings = {"usr_1", "u-s-r", "u_123"})
    public void shouldReturnTrueWhenUsernameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"#", "us", "us+", "usr*"})
    public void shouldReturnFalseWhenUsernameIsIncorrect(String username) {
        assertFalse(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameIsEmpty(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldThrowExceptionWhenUsernameIsNull(String username) throws NullPointerException {
        //assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"))
        assertThrows(NullPointerException.class, () -> userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a.1@gmail.com.com", "adr@gm1.comcom", "1-2_3.u@123.com"})
    public void shouldReturnTrueWhenEmailNameIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"usr.@gm.com", "us#er@gmail.co", "12@1-2-3.#.#*"})
    public void shouldReturnFalseWhenEmailNameIsIncorrect(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueWhenEmailNameIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailIsNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}