package com.definelabpractice.logical;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String str = "swiss";

        //Step 1 Count Frequency of Each Character
        HashMap<Character , Integer> freqchar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqchar.put(ch, freqchar.getOrDefault(ch,0)+1);
        }

        //step 2 Traverse the string Again (in original order) for find the first character wi
        char result = '\0';// "not found yet"
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freqchar.get(ch)==1){
                result = ch;
                found = true;
                break;//stop the first found
            }
        }
        if(found){
            System.out.println("Found the First Single Character : "+ result);
        }else{
            System.out.println("No non-repeating character found");
        }
    }




}
