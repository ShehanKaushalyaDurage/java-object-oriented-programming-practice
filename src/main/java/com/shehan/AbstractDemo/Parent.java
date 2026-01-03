package com.shehan.AbstractDemo;

//It cannot be instantiated
//It defines what must be done, not how
//Parent is acting like a blueprint / contract
//Any child of Parent must define career() and partner()
public abstract class Parent {

    //Focus on what should be done, not how.
    abstract void career();
    abstract void partner();
}
