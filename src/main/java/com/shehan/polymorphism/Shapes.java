package com.shehan.polymorphism;

//One method name, many behaviors
//The same method call behaves differently depending on the object type
//Parent Class
public class Shapes {
    void area(){
        System.out.println("Area of Shapes");
    }


    //Early binding
    //The method call is resolved at compile time, not at runtime.
    //A final method cannot be overridden by child classes.
    //final void area(){
    //    System.out.println("Area of Shapes");
    //}
}
