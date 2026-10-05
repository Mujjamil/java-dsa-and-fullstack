package com.javabyvishalsir.machinetest;

public class Student {
    private int rollno;
    private String name;
    private String departmenet;
    private String subject;
    private double marks;

    private String result;
    private String division;

    public Student(int rollno,String name, String departmenet, String subject,  double marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.departmenet = departmenet;
        this.subject = subject;
        this.name = name;
    }

    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public String getDepartmenet(){
        return departmenet;
    }



    public String getSubject(){
        return subject;
    }
    public double getMarks(){
        return marks;
    }

    public void setResult(String result){
        this.result = result;
    }
    public void setDivision(String division){
        this.division = division;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", departmenet='" + departmenet + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                ", division='" + division + '\'' +
                '}';
    }

}
