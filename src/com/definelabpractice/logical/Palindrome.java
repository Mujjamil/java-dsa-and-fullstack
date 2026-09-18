package com.definelabpractice.logical;

public class Palindrome {
    public static void main(String[] args){
        int num = 121;
        int original = num;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if(reverse == original){
            System.out.println("The given number is palindrome");
        }else{
            System.out.println("The given number is not palindrome");
        }


    }

}
