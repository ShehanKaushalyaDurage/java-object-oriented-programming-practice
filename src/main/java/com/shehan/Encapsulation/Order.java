package com.shehan.Encapsulation;

//Encapsulation at System Boundary
public class Order {

    //State cannot change after creation
    //Object is immutable
    private final double amount;

    //Validation in constructor -- Object cannot be created in invalid state , No “half-valid” object ever exists
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
