package com.shehan.interfaces;

//Anything that can brake must know how to brake
public interface Brake {
    void brake();
    //void start(); //That breaks Interface Segregation Principle
}
