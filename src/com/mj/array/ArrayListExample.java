package com.mj.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        //Syntax
         ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(234);
//        list.add(87);
//        list.add(95);
//        list.add(83);
//        list.add(34);
//        list.add(75);
//        System.out.println(list);
//        list.set(0,87);
//        list.remove(2);
//        System.out.println(list );

        //-------------------------

        //input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[next] syntax will not work here 
        }


    }
}
