package com.kodilla.spring.basic.dependency_injection.homework;

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
