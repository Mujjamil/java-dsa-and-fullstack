package com.mj;

public class Overloading {
    static void main(String[] args) {
        fun(67);
        fun("mujjamil");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
 