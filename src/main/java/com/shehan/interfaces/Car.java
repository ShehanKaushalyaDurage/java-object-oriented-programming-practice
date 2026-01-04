package com.shehan.interfaces;

//Multiple Inheritance
//Java does NOT allow: class Car extends Engine, Brake
//But Java DOES allow: class Car implements Engine, Brake

public class Car implements Engine,Brake {
    @Override
    public void brake() {
        System.out.println("Braking a Car");
    }

    @Override
    public void start() {
        System.out.println("Starting a Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping a Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating a Car");
    }
}
