package com.mj.oops.linearsearch;

import java.util.Arrays;

public class SearchInStrings {
    static void main(String[] args) {
        String name = "Mujjamil";
        char target = 'a';
//        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
 


    }

    static boolean search2(String str , char target){
        if(str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str , char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }
        return false;


    }
}
