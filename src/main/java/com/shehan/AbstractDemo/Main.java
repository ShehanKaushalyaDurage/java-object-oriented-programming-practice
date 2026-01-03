package com.shehan.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();

        /*
          S.B.S
          1.JVM creates a Son object
          2.son.career() is called
          3.JVM looks for career() in Son
          4.Son has overridden career()
          5.Son’s method is executed
        */


        Daughter doughter = new Daughter();
        doughter.career();

    }
}
