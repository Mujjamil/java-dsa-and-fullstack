package com.bitcode.mysql.menudrivenstudent;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DbUtil db = new DbUtil();


        int choise;
        do {
            System.out.println("Student Menu Driven Program");
            System.out.println("1.Insert Record");
            System.out.println("2.Read all record");
            System.out.println("3.Update Record");
            System.out.println("4.Delete student record by roll no");
            System.out.println("5.Search Student Data By year");
            System.out.println("6.Search Grade first / second class by marks");
            System.out.println("7.Exit");

            System.out.println("Enter Your Choise:");
            choise = sc.nextInt();

            switch(choise){
                case 1:
                    System.out.println("Enter roll no:");
                    int roll = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter the Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter the Marks:");
                    int marks = sc.nextInt();

                    System.out.println("Enter the year");
                    int year = sc.nextInt();

                    Student s = new Student(roll,name,marks,year);
                    db.insertRecord(s);
                    break;

                case 2:
                    db.readAllRecord();
                    break;

                case 3:
                    System.out.println("Enter Roll No:");
                    int rollno = sc.nextInt();

                    System.out.println("Enter New Marks:");
                    int newMarks = sc.nextInt();

                    Student updateStudent = new Student(rollno,"",newMarks,0);
                    db.updateRecord(updateStudent);
                    break;

                case 4:
                    System.out.println("Enter Student Roll no Which you want to delete:");
                    int deletRoll = sc.nextInt();

                    Student deleteStudent = new Student(deletRoll,"",0,0);
                    db.deleteRecord(deleteStudent);
                    break;

                case 5:
                    System.out.println("Search student data by year:");
                    int searchYear = sc.nextInt();

                    Student searchByYr = new Student(0,"",0,searchYear);
                    db.searByYear(searchByYr);
                    break;
                case 6:
                    System.out.println("Enter year:");
                    int yr = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter Grade(First/Second):");
                    String grade = sc.nextLine();

                    db.getRecord(yr,grade);
                    break;

                case 7:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalide Choise");


            }

        }while(choise != 7);




        sc.close();



    }
}
