package com.shehan.polymorphism;

public class Main {
    public static void main(String[] args) {
        //Normal object creation
        //No polymorphism here
        //Reference type = Object type
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        //Normal object call
        shapes.area();//Area of Shapes
        circle.area();//Area of Circle
        square.area();//Area of Square
        triangle.area();//Area of Triangle

        //Runtime Polymorphism (Dynamic Polymorphism)
        //polymorphism here
        //Reference type -> Shapes
        //Object type -> Circle
        //A parent reference can refer to a child object
        Shapes shapes1 = new Circle();


        //The Polymorphic Call
        //Compile time = Does Shapes have area() -> So compilation passes.
        //Runtime = What is the actual object? > Circle -> Is area() overridden? -> YES
        shapes1.area();//Area of Circle


    }
}
