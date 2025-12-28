package com.shehan.inheritance;

//Inheritance is done using the extends keyword
//It represents an IS-A relationship
public class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = 1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        this.weight = other.weight;

        //Step-by-step:
        //Memory is allocated for the other object
        //BoxWeight(BoxWeight other) constructor is called
        //First line → super(other)
        //Box(Box box) constructor is called
        //Parent variables are copied:
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);// what is this? call the parent class contractor
        //used to initialise values present in parent class

        //System.out.println(super.width);//Parent class variable named width

        this.weight = weight; //Child class variable (BoxWeight.weight)
    }
}
