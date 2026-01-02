package com.shehan.Abstraction;

public class PaypalPayment implements PaymentService{
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
