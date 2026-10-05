package com.javabyvishalsir.machinetest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

     public void readStudent(){
         try{
             BufferedReader br = new BufferedReader(new FileReader("/Users/mactm/IdeaProjects/code/src/com/javabyvishalsir/machinetest/students.txt"));
             String line;
             while((line = br.readLine())!=null){
                 if(line.trim().isEmpty()){
                     continue;
                 }

                 String[] data = line.split(",");
                 int rollNo = Integer.parseInt(data[0].trim());
                 String name = data[1].trim();
                 String department = data[2].trim();
                 String subject = data[3].trim();
                 Double marks = Double.parseDouble(data[4].trim());

                 Student student = new Student(rollNo,name,department,subject,marks);
                 students.add(student);
             }

             br.close();
             System.out.println(students.size()+"students loaded");
         }catch (Exception e){
             e.getMessage();
         }
     }

     public void displayStudents(){
         for(Student student : students){
             System.out.println(student);
         }

     }

     public void searchByname(String name){
         for(Student student : students){
             if(student.getName().equalsIgnoreCase(name)){
                 System.out.println(student);
             }
         }

     }


     public void searchByrollNo(int rollno){
         for(Student student : students){
             if(student.getRollno() == rollno){
                 System.out.println(student);
             }
         }
     }

     public void searchByDepartmentNo(String department){
         for(Student student : students){
             if(student.getDepartmenet().equalsIgnoreCase(department)){
                 System.out.println(student);
             }
         }
     }

     public void sortByMarks(){
        students.sort(Comparator.comparingDouble(student -> student.getMarks()));
         System.out.println("Students marks by marks");
     }


}
