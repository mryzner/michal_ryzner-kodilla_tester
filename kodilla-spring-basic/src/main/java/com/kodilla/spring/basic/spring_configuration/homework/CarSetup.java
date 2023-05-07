package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.MonthDay;
@Configuration
public class CarSetup {
    MonthDay presentDate = MonthDay.now();
    MonthDay springStart = MonthDay.of(3, 20);
    MonthDay summerStart = MonthDay.of(6, 21);
    MonthDay autumnStart = MonthDay.of(9, 23);
    MonthDay winterStart = MonthDay.of(12, 22);

    @Bean
    public Car selectCarType() {
        Car car;
        if(presentDate.isAfter(winterStart) && presentDate.isBefore(springStart)) {
            car = new SUV();
        }
        else if(presentDate.isAfter(summerStart) && presentDate.isBefore(autumnStart)) {
            car = new Cabrio();
        }
        else {
            car = new Sedan();
        }
        return car;
    }
}
