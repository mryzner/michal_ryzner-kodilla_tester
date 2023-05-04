package com.kodilla.spring.basic.dependency_injection.homework;

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
