package com.shehan.Abstraction;

//Abstraction with Multiple Implementations
public class CreditCardPayment implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
