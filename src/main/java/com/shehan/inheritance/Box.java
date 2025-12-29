package com.shehan.inheritance;

public class Box {

    private double length;
    double width;
    double height;

    void box(){
        System.out.println("Box Box is: " + this.length + " " + this.width + " " + this.height);
    }

    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    //cube
    Box(double side) {

        //Class Object is the root of the class hierarchy.
        //Every class has Object as a superclass.
        //super();

        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double width, double height, double side) {
        this.length = width;
        this.width = width;
        this.height = height;
    }

    Box(Box box) {
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
