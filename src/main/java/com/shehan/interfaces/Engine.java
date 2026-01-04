package com.shehan.interfaces;

//Anything that has an engine can start, stop, and accelerate.
public interface Engine {
    static final int price = 78000;

    void start();
    void stop();
    void accelerate();

}
