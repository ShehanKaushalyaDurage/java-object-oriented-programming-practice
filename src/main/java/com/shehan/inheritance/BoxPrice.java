package com.shehan.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    void cost(){
        System.out.println("Box Cost is: " + this.cost);
    }

    public BoxPrice(){
        super();
        this.cost = -1;
    }

    public BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double width, double height, double length, double weight, double cost) {
        super(width, height, length, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
