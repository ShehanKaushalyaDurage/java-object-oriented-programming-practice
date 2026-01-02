package com.shehan.Abstraction;

public class Main {

    //Abstraction
    // Real-life thinking
    //1. You drive a car:
    //2. You press accelerator
    //3. You don’t care about engine internals

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();

        //Open/Closed Principle
        //Easy to add new payment methods
        PaymentService service = new PaypalPayment();
        service.pay(20000);

        PaymentService service2 = new CreditCardPayment();
        service2.pay(30000);

        //No concrete dependency
        //Easily testable
        PaymentService service3 = new PaypalPayment();
        PaymentProcessor processor = new PaymentProcessor(service3);
        processor.process(10000);
    }


}
