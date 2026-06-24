package com.mj;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String Department = in.next();
        switch (empId) {
            case 1 -> System.out.println("Mujjamil Jamadar");
            case 2 -> System.out.println("Tushar Jadhav");
            case 3 -> {
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("management Department");
                    default -> System.out.println("no Department entered");
                }
            }
            default -> System.out.println("not valid employee id");
        }
    }
}
