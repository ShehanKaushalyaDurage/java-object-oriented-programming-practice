package com.shehan.polymorphism;

//Child Classes
public class Circle extends Shapes{

    //this will run when obj of circle is created
    //hence it is overriding the parent method
    @Override // this is called annotation
    void area(){
        System.out.println("Area of Circle");
    }

    //Method does not override method from its superclass
//    @Override
//    void areaa(){
//        System.out.println("Area of Circle");
//    }
}
