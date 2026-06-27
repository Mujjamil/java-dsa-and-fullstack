package com.bitcode.questions.mysql;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DbUtil db = new DbUtil();

        int choose;
        do{
            System.out.println("Bank Account");
            System.out.println("1.Insert Account Details");
            System.out.println("2.Deposite Ammount");
            System.out.println("3.Withdraw Amount");
            System.out.println("4.Show Account Balance");
            System.out.println("5.Exit");
            System.out.println("Enter Your Choise:");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Enter the Id:");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Enter the Account Holder Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter the Amount");
                    double balance = sc.nextDouble();

                    BankAccount b = new BankAccount(balance,name,id);
                    db.insertBalance(b);
                    break;

                case 2:
                    System.out.println("Enter the ID:");
                    int Id = sc.nextInt();

                    System.out.println("Enter the Amount For deposite:");
                    double dBalance = sc.nextDouble();

                    BankAccount depositAmount = new BankAccount(dBalance,"",Id);
                    db.depositAmmount(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the ID:");
                    int iid = sc.nextInt();

                    System.out.println("Enter the Amount For Withdraw:");
                    double wBalance = sc.nextDouble();

                    BankAccount wAmount = new BankAccount(wBalance,"",iid);
                    db.withDrwaAmmount(wAmount);
                    break;

                case 4:
                    System.out.println("Enter The Account ID:");
                    int aid = sc.nextInt();
                    double ccbalance = db.remainingBalance(aid);
                    System.out.println("The Current Account Balance is:"+ccbalance);
                    break;
                case 5:
                    System.out.println("Thank you for connecting with us");
                    break;
                default:
                    System.out.println("invalid choose");
            }
        }while (choose!=5);




    }
}
