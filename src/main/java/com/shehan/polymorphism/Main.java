package com.shehan.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shapes shapes1 = new Circle();
        shapes1.area();//Area of Circle

        shapes.area();//Area of Shapes
        circle.area();//Area of Circle
        square.area();//Area of Square
        triangle.area();//Area of Triangle
    }
}
