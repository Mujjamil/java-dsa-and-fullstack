package com.javabyvishalsir.collection;

public class Main {
    static void main(String[] args) {
        MyArrayList<String> st = new MyArrayList<>();
        st.add("Mujjamil");
        System.out.println(st);
        st.add("Tejas");
        System.out.println(st);
        System.out.println(st.get(1));
        st.set(1,"Aryan");
        System.out.println(st);
        st.sort();
        System.out.println(st);
    }
}
