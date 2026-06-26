package com.bitcode.mysql.menudrivenstudent;

public class Student {
    private int rollno;
    private String name;
    private int marks;

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", year=" + year +
                '}';
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

    private int year;
}
