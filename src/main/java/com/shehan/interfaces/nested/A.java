package com.shehan.interfaces.nested;

public class A {
    //All interfaces inside a class are implicitly static.
    //public static interface nestedInterface {}
    //You do NOT need an object of A
    //You can directly use A.nestedInterface


    //nested interface
    public interface nestedInterface {
        Boolean isOdd(int number);
    }
}
