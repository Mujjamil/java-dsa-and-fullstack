package com.mj.oops.abstractclass;

public class Son extends Parent{


    public Son(int age){
      super(age);
    }

    @Override
    public void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I Love Pepper bots");
    }
}
