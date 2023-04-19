package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> getOrdersFromGivenPeriod(LocalDate start, LocalDate end) {
        return orders
                .stream()
                .filter(order -> order.getOrderDate().isAfter(start) && order.getOrderDate().isBefore(end))
                .collect(Collectors.toList());
    }
    public List<Order> getOrdersSortedByLimitValue(int minValue, int maxValue) {
        return orders
                .stream()
                .filter(order -> order.getOrderPrice() >= minValue && order.getOrderPrice() <= maxValue)
                .collect(Collectors.toList());
    }
    public int getOrdersSize() { return orders.size(); }

    public int getSumOfAllOrdersValues() {
        return orders
                .stream()
                .mapToInt(order -> order.getOrderPrice())
                .sum();
    }
}
