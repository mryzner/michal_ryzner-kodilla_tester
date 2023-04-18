package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private int orderPrice;
    private LocalDate orderDate;
    private String userLogin;

    public Order(int orderPrice, LocalDate orderDate, String userLogin) {
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.userLogin = userLogin;
    }

    public int getOrderPrice() { return orderPrice; }
    public LocalDate getOrderDate() { return orderDate; }
    public String getUserLogin() { return userLogin; }

    @Override
    public String toString() {
        return "Order{" +
                "orderPrice=" + orderPrice +
                ", orderDate=" + orderDate +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }
}
