package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;

class CarSetupTestSuite {

    private Clock clock = Mockito.mock(Clock.class);
    private CarSetup carSetup = new CarSetup(clock);

    @Test
    public void shouldBeSedanWithLightsOff_WhenSpringBefore20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 5, 10, 19, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOn_WhenSpringAfter20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 5, 10, 20, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOff_WhenSpringAfter6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 5, 10, 6, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOn_WhenSpringBefore6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 5, 10, 05, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeCabrioWithLightsOff_WhenSummerBefore20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 7, 10, 19, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Cabrio", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeCabrioWithLightsOn_WhenSummerAfter20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 7, 10, 20, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Cabrio", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeCabrioWithLightsOff_WhenSummerAfter6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 7, 10, 6, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Cabrio", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeCabrioWithLightsOn_WhenSummerBefore6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 7, 10, 05, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Cabrio", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOff_WhenAutumnBefore20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 11, 10, 19, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOn_WhenAutumnAfter20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 11, 10, 20, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOff_WhenAutumnAfter6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 11, 10, 6, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSedanWithLightsOn_WhenAutumnBefore6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 11, 10, 05, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSuvWithLightsOff_WhenWinterBefore20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 1, 10, 19, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("SUV", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSuvWithLightsOn_WhenWinterAfter20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 1, 10, 20, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("SUV", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSuvWithLightsOff_WhenWinterAfter6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 1, 10, 6, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("SUV", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSuvWithLightsOn_WhenWinterBefore6() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 1, 10, 05, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("SUV", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }
}