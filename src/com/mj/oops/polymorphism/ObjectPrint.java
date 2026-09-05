package com.mj.oops.polymorphism;

public class ObjectPrint  {


    int num;
    public ObjectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }


    static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
