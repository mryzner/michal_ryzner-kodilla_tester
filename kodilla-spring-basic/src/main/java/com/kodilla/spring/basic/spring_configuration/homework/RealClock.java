package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RealClock implements Clock {

    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}
