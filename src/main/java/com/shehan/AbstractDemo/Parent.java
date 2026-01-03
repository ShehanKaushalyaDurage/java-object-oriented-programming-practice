package com.shehan.AbstractDemo;

//It cannot be instantiated
//It defines what must be done, not how
//Parent is acting like a blueprint / contract
//Any child of Parent must define career() and partner()
public abstract class Parent {

    int age;

    //Abstract Class CAN Have a Constructor
    public Parent(int age) {
        this.age = age;
    }

    //abstract Parent(); // NOT ALLOWED


    //Focus on what should be done, not how.
    abstract void career();

    abstract void partner();


    //Important point
    /*We cannot create an object of an abstract class because it may contain abstract methods that are not implemented,
    not because abstract constructors are not allowed.*/

}
