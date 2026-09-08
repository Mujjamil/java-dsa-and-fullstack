package com.mj.oops.interfaces.nested;

public class A {
    public  interface NestedInterface {
        boolean idOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean idOdd(int num) {
        return (num & 1) == 1;
    }
}

