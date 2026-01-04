package com.shehan.interfaces.nested;

public class B implements A.nestedInterface {
    @Override
    public Boolean isOdd(int number) {
        return number % 2 == 0;
    }
}
