package com.bitcode.map.linktree;

import java.util.LinkedHashMap;

public class Main {
    static void linkedHashMapDemo(){
        LinkedHashMap<Integer,String> linkedHMap = new LinkedHashMap();
        linkedHMap.put(1,"First");
        linkedHMap.put(2,"Second");
        linkedHMap.put(3,"Third");
        linkedHMap.put(4,"Fourth");
        System.out.println("linked HashMap="+linkedHMap);
        System.out.println("key="+linkedHMap.get(2));
        System.out.println("value="+linkedHMap.values());
        linkedHMap.remove(3);
        System.out.println("after removel:"+linkedHMap);
    }

    static void main(String[] args) {
        linkedHashMapDemo();
    }
}
