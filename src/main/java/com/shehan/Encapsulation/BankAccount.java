package com.shehan.Encapsulation;

public class BankAccount {

    //private - hide data
    private double balance;

    // controlled read access
    public double getBalance() {
        return balance;
    }

    // controlled write access
    public void setBalance(double amount) {
        if (amount  > 0) {
            balance += amount;
        }
    }

    //Encapsulation ensures that the BankAccount object controls its own balance.
    //External code cannot put the account into an invalid state because all updates go through validated methods.
}
