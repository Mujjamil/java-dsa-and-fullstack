package com.mj.oops.abstractclass;

public abstract class Parent {

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 2343534;
    }

    int age;

    abstract void career();
    abstract void partner();
}
