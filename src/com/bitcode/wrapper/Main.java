package com.bitcode.wrapper;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Integer objint = 23;//autobosting;
        System.out.println(objint);
        int pNum = objint;
        System.out.println(pNum);//Unboxing;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);//automating implicity
        System.out.println("both ind value"+list.get(0));//unboxing
        Integer.parseInt("10");

    }
}
