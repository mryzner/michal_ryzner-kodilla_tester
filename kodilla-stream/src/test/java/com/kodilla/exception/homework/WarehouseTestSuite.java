package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    Warehouse warehouse = new Warehouse();

    @Test
    public void testGetOrder_withException() {
        warehouse.addOrder(new Order("1"));
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("2"));
    }
    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("1"));
        Order expectedOrder = new Order("1");
        Order result = warehouse.getOrder("1");
        assertEquals(expectedOrder.getNumber(), result.getNumber());
    }

}