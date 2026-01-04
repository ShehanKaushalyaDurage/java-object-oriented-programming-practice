package com.shehan.interfaces.nested;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(3));
    }
}
//Why use a nested interface instead of a normal interface?
//To logically group related contracts, avoid naming conflicts, and design clean APIs.