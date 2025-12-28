package com.shehan.inheritance;

//Inheritance is done using the extends keyword
//It represents an IS-A relationship
public class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = 1;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);// what is this? call the parent class contractor
        //used to initialise values present in parent class
        this.weight = weight;
    }
}
