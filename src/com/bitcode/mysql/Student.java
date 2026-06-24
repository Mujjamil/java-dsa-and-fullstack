package com.bitcode.mysql;

public class Student {
    private int rollno;
    private String name;
    private int marks;
    private int year;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(int rollno, String name, int marks, int year) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Main{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", year=" + year +
                '}';
    }
}
