package com.bitcode.questions;

public class Student {
    private int rollno;
    private String name;
    private int marks;

    public Student(int rollno, String name, int marks) {
        this.rollno = this.rollno;
        this.name = this.name;
        this.marks = this.marks;
    }



    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
