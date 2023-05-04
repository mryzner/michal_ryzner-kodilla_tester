package com.kodilla.spring.basic.spring_dependency_injection.homework.shipping;

import org.springframework.stereotype.Component;

@Component
public class TruckDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 36000) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivery by truck in progress...");
        return true;
    }
}
