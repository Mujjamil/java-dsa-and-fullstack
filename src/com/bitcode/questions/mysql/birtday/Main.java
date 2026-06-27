package com.bitcode.questions.mysql.birtday;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DbBirthdayUtil db = new DbBirthdayUtil();
        int choice;
        do {

            System.out.println("Birthday Management System");
            System.out.println("1.Add Friend");
            System.out.println("2.Search Birthday By Name");
            System.out.println("3.Search Birthdays By Month");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Friend ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Friend Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Birthday (yyyy-mm-dd): ");
                    String birth = sc.nextLine();
                    Date birthday = Date.valueOf(birth);
                    Birthday b = new Birthday(id, name, birthday);

                    db.insertBirthdate(b);

                    break;

                case 2:

                    System.out.print("Enter Friend Name: ");
                    String searchName = sc.nextLine();
                    Birthday b1 = new Birthday(0, searchName, null);
                    db.searByName(b1);
                    break;

                case 3:
                    System.out.print("Enter Month (1-12): ");
                    int month = sc.nextInt();
                    db.searchByMonth(month);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();

    }


}
