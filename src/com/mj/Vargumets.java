package com.mj;

import java.util.Arrays;
public class Vargumets {
    static void main(String[] args) {
        fun(2,3,4,5,5,5);
        mulitple(2,4,"Mujjamil","Jamadar");
    }
static void mulitple(int a, int b, String ...v){

}
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
//this used for getting more and more arguments