package com.bitcode.map.treemap;

import java.util.TreeMap;

public class Main {

    static void treeMapDemo(){
        TreeMap<String,String> tMap = new TreeMap<String,String>();
        tMap.put("name","Ritu");
        tMap.put("city","pune");
        tMap.put("univeristyy","pune");
        System.out.println("tMap="+tMap);
        System.out.println("tMap First key="+tMap.firstKey());
        System.out.println("tMap last key = "+tMap.lastKey());
        System.out.println("tMap="+tMap.headMap("name"));
        System.out.println("tMap="+tMap.tailMap("city"));
    }
    static void main(String[] args) {
        treeMapDemo();
    }
}
