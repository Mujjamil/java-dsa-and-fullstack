package com.thinkitive;

public class Palindrome {
    public static void main(String[] args){
        String str = "madam";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("word is palindrome");
        }else{
            System.out.println("word is not palindorme");
        }
    }
}
