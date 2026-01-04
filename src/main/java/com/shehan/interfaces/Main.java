package com.shehan.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.start();
        car.stop();
        car.brake();

        Brake brake = new Car();
        brake.brake();
        brake.start();

        Car car2 = new Engine();
    }
}
