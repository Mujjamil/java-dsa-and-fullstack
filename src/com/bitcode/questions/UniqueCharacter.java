package com.bitcode.questions;

public class UniqueCharacter {
    static void main(String[] args) {

        System.out.println(uichar("javascript"));
    }
    static int uichar(String str){
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count==1){
                uniqueCount++;
            }
        }
        return uniqueCount;

    }
}
