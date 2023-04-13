package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.xml.validation.Validator;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();
    @ParameterizedTest     // Valuesource nie obsługuje Null
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest      // EmptySource zamiast pustego Stringa: ""
    @EmptySource
    public void shouldReturnTrueIfStringIsEmpty2(String text) {
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest  // Null i Empty w jednej adnotacji
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty3(String text) {
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty4(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }



}