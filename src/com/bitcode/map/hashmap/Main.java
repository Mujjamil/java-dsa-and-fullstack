package com.bitcode.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    static void hashMapDemo(){
        Map<String,Integer> hMap = new HashMap();
        hMap.put("First",100);
        hMap.put("Second",200);
        hMap.put("Third",300);
        hMap.put("Fourth",200);

        System.out.println("value of key Third="+hMap.get("Third"));
        hMap.remove("Third");
        System.out.println("Map"+hMap);
        System.out.println("Search the key first: "+hMap.containsKey("First"));
        System.out.println("Saarch the value 200="+hMap.containsValue(200));




        Iterator<Map.Entry<String,Integer>> itr =  hMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> map = itr.next();
            System.out.println(map.getKey()+"--->"+map.getValue());
        }

    }



    static void main() {
        hashMapDemo();

    }
}
