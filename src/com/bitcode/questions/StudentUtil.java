package com.bitcode.questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentUtil {
    Scanner sc;
    ArrayList list;
    public StudentUtil(){
        sc = new Scanner(System.in);
        list = new ArrayList<Student>();
    }
    public void createStudent(){
        System.out.println("Enter the rollno:");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the marks:");
        int marks = sc.nextInt();

        Student s = new Student(rollno,name,marks);
        list.add(s);
        System.out.println("Record inserted");
    }
    public void updateStudent(){
        System.out.println("Enter the rollno to be updated:");
        int rno = sc.nextInt();

        System.out.println("Enter the marks to be updated");
        int newMks = sc.nextInt();

        boolean flag = false;
        for(int i = 0; i<list.size();i++){
            Student s = (Student) list.get(i);
            if(rno == s.getRollno()){
                s.setMarks(newMks);
                list.add(i,s);
                System.out.println("Record updated.....!");
            }
        }
        if(flag==false){
            System.out.println("Record not found");
        }
    }
    public void removeStudent(){
        System.out.println("Enter the rollno to be removed:");
        int rno = sc.nextInt();


        boolean flag = false;
        for(int i = 0; i<list.size();i++){
            Student s = (Student) list.get(i);
            if(rno == s.getRollno()){
                flag = true;
                list.remove(list.get(i));
                System.out.println("Record removed.....!");
            }
        }
        if(flag==false){
            System.out.println("record not found");
        }
    }
    public void displayStudent(){

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void searchRecord(){

    }
}
