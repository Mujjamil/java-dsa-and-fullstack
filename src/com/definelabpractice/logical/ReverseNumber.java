package com.definelabpractice.logical;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
//--------------------------------------
//       int num = 1234;
//       int original = num;
//       int reversed = 0;
//       while(num != 0){
//           int digit = num % 10;
//           reversed = reversed * 10 + digit;
//           num = num/10;
//       }
//        System.out.println(original);
//        System.out.println(reversed);

//        ------------------------------------------- reverse number by taking input form user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Write a number which you wants to do reverse: ");
//        int num = sc.nextInt();
//        int reverse = 0;
//        int original = num;
//        while(num != 0){
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num = num / 10;
//        }
//
//        System.out.println("The give number is :" + original);
//        System.out.println("The reversed number is :"+ reverse);
//        --------------------------------------------------------------

        int num = 1234;
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        int reverse = Integer.parseInt(str);
        System.out.println("The reversed number in Integer :"+ reverse);
        System.out.println("The reverse in string "+reversedStr);

    }
}
