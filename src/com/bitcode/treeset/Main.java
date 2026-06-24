package com.bitcode.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    static public void treeSetDemo(){
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("mango");
        treeset.add("apple");
        treeset.add("pineapple");

        System.out.println(treeset.size());
        //treeset
        Iterator<String> itr = treeset.iterator();
        while (itr.hasNext()) {

            String str = itr.next();
            if(str.startsWith("p")){
                itr.remove();
            }else{
                System.out.println(itr.next());
            }


        }


        System.out.println(treeset.first());
        System.out.println(treeset.last());


    }
    static void main(String[] args) {
      treeSetDemo();
    }
}
