package com.shehan.AbstractDemo;

public class Son extends Parent {
    @Override //Ensures correct method overriding
    void career() {
        System.out.println("I'm going to be a Politician");
    }

    @Override
    void partner() {
        System.out.println("I Love Mahinda Mahaththaya");
    }
}
