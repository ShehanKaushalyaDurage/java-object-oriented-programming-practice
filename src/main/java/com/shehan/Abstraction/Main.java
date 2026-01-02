package com.shehan.Abstraction;

public class Main {

    //Abstraction
    // Real-life thinking
    //1. You drive a car:
    //2. You press accelerator
    //3. You don’t care about engine internals

    //Abstraction means programming against behavior, not implementation, so the caller depends on what an object does, not how it does it.

    public static void main(String[] args) {

        //Polymorphism - Runtime binding
        //Loose Coupling
        Vehicle vehicle = new Car();
        vehicle.start();

        //Open/Closed Principle -Extend without modify
        //Easy to add new payment methods
        //Abstraction allows us to add new payment methods without modifying existing code.
        PaymentService service = new PaypalPayment();
        service.pay(20000);

        PaymentService service2 = new CreditCardPayment();
        service2.pay(30000);

        //No concrete dependency
        //Easily testable
        PaymentService service3 = new PaypalPayment();
        PaymentProcessor processor = new PaymentProcessor(service3);
        processor.process(10000);
        //High-level module: PaymentProcessor
        //Low-level modules: PaypalPayment, CreditCardPayment
        //Both depend on abstraction (PaymentService)





        //Common Questions
        //Why use interface instead of abstract class? = Interfaces allow multiple implementations and promote loose coupling.
        //How does abstraction improve testability? = We can inject a mock implementation of PaymentService.
        //Is abstraction same as encapsulation? = No. Encapsulation protects state, abstraction hides implementation details.
        //Where is polymorphism used? =When PaymentService reference points to different implementations at runtime.
    }


}
