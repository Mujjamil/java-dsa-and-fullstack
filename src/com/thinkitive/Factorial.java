package com.thinkitive;

import java.util.Scanner;


public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=n;
        }
        System.out.println("The Factorial of= "+n+"is = "+fact);
    }
}
