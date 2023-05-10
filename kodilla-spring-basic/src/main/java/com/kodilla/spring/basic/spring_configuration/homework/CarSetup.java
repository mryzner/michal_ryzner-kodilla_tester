package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.MonthDay;

@Configuration
public class CarSetup {

    private Clock clock;

    @Autowired
    public CarSetup(Clock clock) {
        this.clock = clock;
    }

    private static final MonthDay springStart = MonthDay.of(3, 21);
    private static final MonthDay summerStart = MonthDay.of(6, 22);
    private static final MonthDay autumnStart = MonthDay.of(9, 21);
    private static final MonthDay winterStart = MonthDay.of(12, 22);

    @Bean
    public Car selectCarType() {

        Car car;
        LocalDateTime currentTime = clock.getCurrentTime();
        MonthDay presentDate = MonthDay.of(currentTime.getMonth(), currentTime.getDayOfMonth());

        if ((presentDate.isAfter(springStart)) && (presentDate.isBefore(summerStart))) {
            car = new Sedan();
        } else if ((presentDate.isAfter(summerStart)) && (presentDate.isBefore(autumnStart))) {
            car = new Cabrio();
        } else if ((presentDate.isAfter(autumnStart)) && (presentDate.isBefore(winterStart))) {
            car = new Sedan();
        } else {
            car = new SUV();
        }

        if (currentTime.getHour() >= 20 || currentTime.getHour() <= 6) {
            car.setHeadlights(true);
        }

        return car;
    }
}
