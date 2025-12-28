package com.shehan.inheritance;

public class Box {

    double length;
    double width;
    double height;


    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    //cube
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double width, double height, double side){
        this.length = width;
        this.width = width;
        this.height = height;
    }

    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
