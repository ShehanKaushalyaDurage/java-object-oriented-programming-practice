package com.shehan.interfaces;

public class Main {
    public static void main(String[] args) {
        //Full Access via Concrete Class
        Car car = new Car();
        car.accelerate();
        car.start();
        car.stop();
        car.brake();

        //Car IS-A Brake
        //Java only allows methods declared in the reference type
        //This is called Interface-based polymorphism

        //Brake brake = new Car();
        //brake.brake();
        //brake.start();

        //Engine does not know HOW to start/stop/accelerate
        //Car car2 = new Engine();

        Media carMedia = new Car();
        carMedia.stop();
    }
}
