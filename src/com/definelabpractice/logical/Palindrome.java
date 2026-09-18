package com.definelabpractice.logical;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args){
        int num = 121;

//        int original = num;//with integer option
//        int reverse = 0;
//        while(num != 0){
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num = num/10;
//        }
//        if(reverse == original){
//            System.out.println("The given number is palindrome");
//        }else{
//            System.out.println("The given number is not palindrome");
//        }
//
//        String str = Integer.toString(num);// with string option
//        String reverseStr = new StringBuilder(str).reverse().toString();
//        System.out.println(str.equals(reverseStr)?"The number is palindrom":"The number is not palindrom");

        Scanner sc = new Scanner(System.in);
        int numm = sc.nextInt();
        int original = numm;//with integer option
        int reverse = 0;
        boolean palindrom = false;
        while(numm != 0){
            int digit = numm % 10;
            reverse = reverse * 10 + digit;
            numm = numm/10;
        }
        if(reverse == original){
            palindrom = true;
        }else{
            palindrom = false;
            }

        System.out.println(palindrom);


    }

}
