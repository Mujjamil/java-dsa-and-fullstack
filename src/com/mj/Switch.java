package com.mj;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("the king of fruit");
            case "Apple" -> System.out.println("Sweet and good fruit");
            case "Cherry" -> System.out.println("Reddish color fruit");
            default -> System.out.println("Please Enter the valid fruit");
        }
    }
}
