package com.mj.oops.abstractdemo;

public class Main {
    public static void main(String[] args){
        Son son = new Son();
        son.career();
        son.partner();
        son.normal();

        Daughter daughter = new Daughter();
        daughter.career();
        daughter.partner();

    }
}
