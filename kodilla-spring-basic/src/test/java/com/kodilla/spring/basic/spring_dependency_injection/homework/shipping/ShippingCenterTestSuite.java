package com.kodilla.spring.basic.spring_dependency_injection.homework.shipping;

import org.junit.jupiter.api.Assertions;
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
    public void shouldReturnNotification() {
        String result = shippingCenter.sendPackage("Mój dom", 25);
        Assertions.assertNotNull(result);
    }
    @Test
    public void shouldDeliverPackageIfNotTooHeavy() {
        boolean result = deliveryService.deliverPackage("Mój dom", 15);
        assertTrue(result);
    }
    @Test
    public void shouldNotDeliverPackageIfTooHeavy() {
        boolean result = deliveryService.deliverPackage("Inny dom", 50);
        assertFalse(result);
    }
    @Test
    public void shouldReturnSuccessMessageIfWeightIsCorrect() {
        String expectedMessage = "Package delivered to: Szczebrzeszyn";
        String result = shippingCenter.sendPackage("Szczebrzeszyn", 15);
        assertEquals(expectedMessage, result);
    }
    @Test
    public void shouldReturnFailMessageIfWeightIsTooHeavy() {
        String expectedMessage = "Package not delivered to: Szczebrzeszyn";
        String result = shippingCenter.sendPackage("Szczebrzeszyn", 75);
        assertEquals(expectedMessage, result);
    }
}