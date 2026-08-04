package com.mj.oops.classandobjects;

public class WrapperExample {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 45;
        swap(a,b);
        System.out.println(a+" "+b);
        final int bonus = 2;//final keyword
//        bonus = 3; // its example which we cant change because of final
        final A kunal = new A("Mujjamil Jamadar");
        kunal.name="MJ";

        //when a non pritmitive is final , you cannot reassign it.
//        kunal = new A("Hi there is me");

        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");
            
        }

    }
    static void swap(int a, int b){
        Integer temp = a;
        a=b;
        b=temp;
    }
}

class A{
    final int  num = 10;
    String name;

    public A(String name) {

        this.name = name;
    }

    protected void finalized() throws Throwable{
        System.out.println("Object is Destroyed");
    }
}

