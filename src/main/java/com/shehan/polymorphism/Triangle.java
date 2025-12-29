package com.shehan.polymorphism;

//Child Classes
public class Triangle extends Shapes{

    //This is method overriding
    @Override
    void area(){
        System.out.println("Area of Triangle");
    }
}
