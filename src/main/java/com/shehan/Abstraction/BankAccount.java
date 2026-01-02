package com.shehan.Abstraction;

public class BankAccount {
    public double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount  > 0) {
            balance += amount;
        }
    }
}
