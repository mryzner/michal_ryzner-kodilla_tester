package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.List;

public class ShopApplication {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order1 = new Order(100, LocalDate.of(2023, 4, 19), "SupaUsaa");
        Order order2 = new Order(70, LocalDate.of(2021, 4, 22), "BadUsaa");
        Order order3 = new Order(200, LocalDate.of(2001, 5, 29), null);
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        List<Order> result = shop.getOrdersFromGivenPeriod(LocalDate.of(2021, 4, 20), LocalDate.of(2023, 4, 29));
        List<Order> result2 = shop.getOrdersSortedByLimitValue(60, 210);
        System.out.println("Result: " + result + " Result2: " + result2);

        int result3 = shop.getSumOfAllOrdersValues();
        System.out.println(result3);
    }
}
