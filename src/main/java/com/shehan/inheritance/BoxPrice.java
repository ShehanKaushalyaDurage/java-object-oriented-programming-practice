package com.shehan.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

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
}
