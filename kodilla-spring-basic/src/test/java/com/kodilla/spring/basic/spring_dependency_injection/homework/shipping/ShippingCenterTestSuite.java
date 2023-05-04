package com.kodilla.spring.basic.spring_dependency_injection.homework.shipping;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
    DeliveryService deliveryService = context.getBean(BicycleDeliveryService.class);
    NotificationService notificationService = context.getBean(NotificationEmailService.class);

    @Test
    public void shouldFailIfPackageTooHeavy() {

    }
}