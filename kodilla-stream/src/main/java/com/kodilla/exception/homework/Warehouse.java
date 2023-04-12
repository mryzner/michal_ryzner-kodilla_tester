package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();


    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
    }
}
