package com.mj;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
//        for(int num =1 ; num <= 5; num++){
//            System.out.println(num);
//        }



        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nubmer;");
        int n = in.nextInt();

        for (int num = 1; num <= n ; num++) {

            System.out.print(num+" ");
            
        }
    }
}
