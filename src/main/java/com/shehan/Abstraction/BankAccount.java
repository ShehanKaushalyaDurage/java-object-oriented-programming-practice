package com.shehan.Abstraction;

public class BankAccount {

    //private - hide data
    private double balance;

    //public methods - controlled access
    public double getBalance() {
        return balance;
    }

    //public methods - controlled access
    public void setBalance(double amount) {
        if (amount  > 0) {
            balance += amount;
        }
    }
}
