package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(100, LocalDate.of(2023, 4, 19), "SupaUsaa");
    Order order2 = new Order(40, LocalDate.of(2021, 4, 22), "BadUsaa");
    Order order3 = new Order(200, LocalDate.of(2022, 5, 29), "RegularUsaa");
    Order order4 = new Order(800, LocalDate.of(2003, 4, 19), "JustAUsaa");
    Order order5 = new Order(0, LocalDate.of(2022, 11, 15), null);

    @BeforeEach
    public void setup() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }
    @Test
    public void testAddOrder() {
        assertEquals(5, shop.getOrdersSize());
    }
    @Test
    public void testGetOrdersFromGivenPeriod() {
        List<Order> expectedOrders = shop.getOrdersFromGivenPeriod(LocalDate.of(2021, 4, 20), LocalDate.of(2023, 4, 20));
        assertEquals(4, expectedOrders.size());
    }
    @Test
    public void testGetOrdersSortedByLimitValue() {
        List<Order> expectedOrders = shop.getOrdersSortedByLimitValue(50, 500);
        assertEquals(2, expectedOrders.size());
    }
    @Test
    public void testGetSumOfAllOrdersValues() {
        int expectedOrders = shop.getSumOfAllOrdersValues();
        assertEquals(1140, expectedOrders);
    }
}