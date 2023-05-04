package com.kodilla.spring.basic.spring_dependency_injection.homework.shipping;

import org.springframework.stereotype.Component;

@Component
public class VanDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 1500) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivery by van in progress...");
        return true;

    }
}
