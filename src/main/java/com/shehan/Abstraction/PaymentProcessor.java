package com.shehan.Abstraction;

//Abstraction + Dependency Inversion
public class PaymentProcessor {
    private final PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process(double amount) {
        paymentService.pay(amount);
    }
}
