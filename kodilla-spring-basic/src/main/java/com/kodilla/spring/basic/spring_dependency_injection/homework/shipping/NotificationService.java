package com.kodilla.spring.basic.spring_dependency_injection.homework.shipping;

public interface NotificationService {
    String success(String address);

    String fail(String address);
}
