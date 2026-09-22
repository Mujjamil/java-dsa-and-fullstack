package com.javabyvishalsir.Generics;

public class Main {
    public static void main(String[] args){
        Holder<Integer> s1 = new Holder<>(234);
        System.out.println(s1.getValue());
        s1.setValue(345);
        System.out.println(s1.getValue());

        Holder<String> s2 = new Holder<>("Mujjamil");
        System.out.println(s2.getValue());
        s2.setValue("Tejas");
        System.out.println(s2.getValue());


    }

}
