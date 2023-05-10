package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;

class CarSetupTestSuite {

    private Clock clock = Mockito.mock(Clock.class);
    private CarSetup carSetup = new CarSetup(clock);

    @Test
    public void shouldBeSeadanWithLightsOff_WhenSpringBefore20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 5, 10, 19, 59));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertFalse(result.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldBeSeadanWithLightsOff_WhenSpringAfter20() {
        Mockito.when(clock.getCurrentTime()).thenReturn(LocalDateTime.of(2023, 5, 10, 20, 0));

        Car result = carSetup.selectCarType();

        Assertions.assertEquals("Sedan", result.getCarType());
        Assertions.assertTrue(result.hasHeadlightsTurnedOn());
    }
}