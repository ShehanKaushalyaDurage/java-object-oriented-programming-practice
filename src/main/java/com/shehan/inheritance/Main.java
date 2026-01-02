package com.shehan.inheritance;


public class Main {
    public static void main(String[] args) {
//        Box box = new Box(5);
//        Box box1 = new Box(box);
//        System.out.println(box.width + " " + box.height);


//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.height + " " + box3.weight);

//        Box box5 = new BoxWeight(2,2,2,3); //A child object can be referred to by a parent reference
//        System.out.println(box5.width);
        //System.out.println(box5.weight); //Reference type = Box
        //Box class does not have a weight variable
        //The reference type decides which members are accessible

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e boxWeight
        // hence, you should have access to weight variables
        // this also means, that the once you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error

        //BoxWeight box6 = new Box(2,2,2);
        //System.out.println(box6.width);
        //Compile-time error

        //BoxPrice reference sees everything → no error
        //No errors, because BoxPrice is the lowest child, so it sees everything above it.
        //BoxPrice boxPrice = new BoxPrice();
        //boxPrice.weight();
        //boxPrice.cost();
        //boxPrice.box();

        //Box reference knows only Box → child methods invisible
        //Reference type decides what you can access
        //Box box = new Box();
        //box.box();//box() method is defined in Box
        //“Box doesn’t know anything about cost() or weight()”
        //box.cost();
        //box.weight();

        //BoxWeight reference knows up to BoxWeight, not BoxPrice
        //BoxWeight boxWeight = new BoxWeight();
        //boxWeight.box();
        //boxWeight.weight();
        //boxWeight.cost();//cost() exists only in BoxPrice,BoxWeight reference cannot see child methods

        // * Important = Parent reference cannot access child-specific methods

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting();// you can inherit but you cannot override
        //Because static methods belong to the class, not to objects.
        //BoxWeight has access to Box.greeting() through inheritance.
        //This is called method hiding, not overriding.
    }
}
