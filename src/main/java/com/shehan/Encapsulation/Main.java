package com.shehan.Encapsulation;

//Encapsulation -> Protect data
// Encapsulation is controlling how an object’s state is created, accessed, and modified, so the object cannot be put into an invalid state.
public class Main {
    public static void main(String[] args) {

        //BankAccount acc = new BankAccount();
        //acc.balance = -1000000; // invalid but allowed
        //System.out.println("The balance is " + acc.balance);
        //Problem: Anyone can change balance ,No validation

        //With Encapsulation
        //BankAccount acc = new BankAccount();
        //acc.setBalance(1000);
        //System.out.println(acc.getBalance());


        //User user = new User();
        //user.setEmail("shehangmail.com");
        //user.setPassword("shehan123");

        //System.out.println("User Email: " + user.getEmail());
        //System.out.println("User Password: " + user.getPassword());


        Order order = new Order(100);
        System.out.println("Order amount: " + order.getAmount());


        //Common Questions

        // Why not make fields public? = Public fields break encapsulation and allow invalid states.
        // Why put validation inside setters or constructors? = To ensure the object always maintains its invariants.
        // Why use final in Order? = To make the object immutable and prevent state corruption after creation.
        // Is this only encapsulation? = Encapsulation is the main concept, but it also uses access control, immutability, and single responsibility.
    }
}
