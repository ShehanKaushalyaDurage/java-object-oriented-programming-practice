package com.shehan.inheritance;


public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5);
        //Box box1 = new Box(box);
//        System.out.println(box.length+" "+box.width+" "+box.height);


        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,8);
        System.out.println(box3.height + " " + box3.weight);
    }
}
