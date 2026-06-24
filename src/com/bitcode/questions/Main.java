package com.bitcode.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentUtil u = new StudentUtil();


        int op;

        while(true){
        System.out.println("\n1.Create new Student record");
        System.out.println("\n2.Update  Student record");
        System.out.println("\n3.Remove Student record");
        System.out.println("\n4.Display all  Student record");
        System.out.println("\n5.Exist");
        System.out.println("\n.Enter Your option");
        op = sc.nextInt();

        switch (op){
            case 1:u.createStudent();
            case 2:u.updateStudent();break;
            case 3:u.removeStudent();break;
            case 4:u.displayStudent();break;
            case 5:System.exit(0);
            default:
                System.out.println("Invalid choice");


        }

    }
    }
}
