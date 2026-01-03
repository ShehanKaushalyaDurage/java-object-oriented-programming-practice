package com.shehan.AbstractDemo;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("I'm going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I'm going to partner " + name + "and she is" + age);
    }
}
