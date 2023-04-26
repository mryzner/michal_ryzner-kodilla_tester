package com.kodilla.spring.basic.dependency_injection.homework;

public class ShipDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 150000000) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivery by ship in progress...");
        return true;
    }
}
