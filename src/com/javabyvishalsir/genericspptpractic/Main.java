package com.javabyvishalsir.genericspptpractic;

public class Main {
    public static void main(String[] args){
        Holder<String> h1 = new Holder<>("Mujjamil");
        System.out.println(h1.getData());
        h1.setData("Aditya");
        System.out.println(h1.getData());

        Holder<Integer> h2 = new Holder<>(123);
        System.out.println(h2.getData());
        h2.setData(345);
        System.out.println(h2.getData());



        Pair<String , Integer> p = new Pair<>("Aryan",456);
        System.out.println(p);
        System.out.println(p.getValue());
        System.out.println(p.getKey());
        p.setKey("Aditya");
        p.setValue(678);
        System.out.println(p);


        Stack<Integer> s1 = new Stack<>(5);
        System.out.println(s1.isEmpty());
        System.out.println(s1.push(23));
        System.out.println(s1.push(34));
        System.out.println(s1.push(54));
        System.out.println(s1.push(34));
        System.out.println(s1.push(87));
        System.out.println(s1.isFull());


        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());



    }

}
