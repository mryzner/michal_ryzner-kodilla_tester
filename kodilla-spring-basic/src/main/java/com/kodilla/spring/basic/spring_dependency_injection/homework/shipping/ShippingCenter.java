package com.kodilla.spring.basic.spring_dependency_injection.homework.shipping;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {
    @Resource(name = "bicycleDeliveryService")
    private DeliveryService deliveryService;
    @Resource(name = "notificationEmailService")
    private NotificationService notificationService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
