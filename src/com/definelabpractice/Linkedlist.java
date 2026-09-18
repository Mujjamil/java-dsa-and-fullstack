package com.definelabpractice;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Tom");
        linkedList.addFirst("Jerry");
        linkedList.addLast("Added in last");
        linkedList.remove("Added in last");
        System.out.println(linkedList);
    }
}
