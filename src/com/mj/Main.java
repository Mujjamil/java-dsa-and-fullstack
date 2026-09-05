package com.mj;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        sum();

        System.out.println(sum2(2,3));
    }
    static void sum(){
        int num1;
        int num2;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1=sc.nextInt();
        System.out.println("Enter the number 2:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("The total of number is:"+sum);

    }
    static int sum2(int a , int b){
        int sum = a + b;
        return sum;
    }
}
