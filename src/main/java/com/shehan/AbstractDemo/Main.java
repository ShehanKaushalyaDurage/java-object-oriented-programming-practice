package com.shehan.AbstractDemo;

public class Main {
    public static void main(String[] args) {

        /*
          S.B.S
          1.JVM creates a Son object
          2.son.career() is called
          3.JVM looks for career() in Son
          4.Son has overridden career()
          5.Son’s method is executed
        */

        //Son son = new Son();
        //son.career();
        //Daughter daughter = new Daughter();
        //daughter.career();

        //Better (Polymorphism + Abstraction)
        Parent son = new Son(20);
        Parent daughter = new Daughter(30);

        son.career();
        daughter.career();

        //Abstract constructors do NOT exist
        //Abstract classes CAN have constructors
        //Parent mom =new Parent();
    }
}
