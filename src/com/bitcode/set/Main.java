package com.bitcode.set;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void hashSetDemo(){
        HashSet<String> set = new HashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set);
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
    static void main(String[] args) {
    hashSetDemo();
    }
}
