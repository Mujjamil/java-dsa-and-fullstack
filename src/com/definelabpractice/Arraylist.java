package com.definelabpractice;
import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mujjamil");
        list.add("Shakil");
        list.add("Jamadar");
        list.remove("Shakil");
        System.out.println(list.size());

    }

}
