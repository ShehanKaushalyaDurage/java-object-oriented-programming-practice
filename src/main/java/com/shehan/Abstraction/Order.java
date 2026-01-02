package com.shehan.Abstraction;

public class Order {

    private final double amount;

    public Order(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
