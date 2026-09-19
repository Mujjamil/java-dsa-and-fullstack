package com.definelabpractice.logical;
import java.util.Map;
import java.util.HashMap;
public class CharacterFrequency {
    public static void main(String[] args) {
            String str = "Programming";
            HashMap<Character , Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freqMap.containsKey(ch)){
                int charCount = freqMap.get(ch);
                freqMap.put(ch , charCount + 1);
            }else{
                freqMap.put(ch , 1);
            }
        }

        for(Map.Entry<Character , Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
