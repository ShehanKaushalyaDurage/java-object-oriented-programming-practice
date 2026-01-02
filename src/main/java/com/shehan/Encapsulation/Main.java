package com.shehan.Encapsulation;

//Encapsulation -> Protect data
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
    }
}
