package com.kodilla.stream;

import java.util.Objects;

public class Candy {
    private String name;
    private String type;
    private int weight;
    private double price;

    public Candy(String name, String type, int weight, double price) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getWeight() { return weight; }
    public double getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return weight == candy.weight && Double.compare(candy.price, price) == 0 && Objects.equals(name, candy.name) && Objects.equals(type, candy.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, weight, price);
    }
}
