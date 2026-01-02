package com.shehan.Abstraction;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}
