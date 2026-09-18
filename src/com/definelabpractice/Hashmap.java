package com.definelabpractice;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args){
        Map<String , Double> slarymap = new HashMap<>();

        //adding the element
        slarymap.put("Mujjamil",55000.0);
        slarymap.put("Saurabh",60000.0);
        slarymap.put("Prithvi",70000.0);

        System.out.println("Salary of mujjamil is "+slarymap.get("Mujjamil"));
        System.out.println("Salary of Saurabh is "+slarymap.get("Saurabh"));

        slarymap.remove("Prithvi");
        for(Map.Entry<String,Double> entry : slarymap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        System.out.println("Total Employee:"+slarymap.size());

    }
}
